/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Ecuacion;
import servicio.EcuacionServicio;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
@WebServlet(name = "EcuacionControlador", urlPatterns = {"/calcularValores.html"})
public class EcuacionControlador extends HttpServlet {

    private final EcuacionServicio servicioEcua = new EcuacionServicio();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("calcular.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            String[] array = {"valorA", "valorB", "valorC"};

            for (String parametro : array) {
                if (!request.getParameterMap().containsKey(parametro)) {
                    throw new RuntimeException(parametro + " es obligatorio.");
                } else {
                    if (request.getParameter(parametro).isEmpty() || request.getParameter(parametro).isBlank()) {
                        throw new RuntimeException(parametro + " está vacío.");
                    }
                }
            }
            Ecuacion ecua = new Ecuacion();

            ecua.setValorA(Double.parseDouble(request.getParameter("valorA")));
            ecua.setValorB(Double.parseDouble(request.getParameter("valorB")));
            ecua.setValorC(Double.parseDouble(request.getParameter("valorC")));

            //seteamos la potencia
            ecua.setPotencia(Math.pow(ecua.getValorB(), 2) - (4 * ecua.getValorA() * ecua.getValorC()));
            //calculamos valor x1;
            ecua.setValorX1(-ecua.getValorB() - (Math.sqrt(ecua.getPotencia())) / (2 * ecua.getValorA()));
            // calculamos valor x2;
            ecua.setValorX2(-ecua.getValorB() + (Math.sqrt(ecua.getPotencia())) / (2 * ecua.getValorA()));
            //agregamos las variables ya calculadas
            servicioEcua.agregarResultados(ecua);

            request.setAttribute("respuesta", " Datos ingresados Correctamente!!");

            request.getRequestDispatcher("calcular.jsp").forward(request, response);

        } catch (RuntimeException ex) {

            if (ex instanceof NumberFormatException) {
                request.setAttribute("respuesta", "Número no válido.");
            } else {
                request.setAttribute("respuesta", ex.getMessage());
            }
            response.sendRedirect(request.getContextPath() + "/error.html");
        }

    }

}
