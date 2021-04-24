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
import servicio.EcuacionServicio;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
@WebServlet(name = "ListarEcuacionContraldor ", urlPatterns = {"/mostrar.html"})
public class ListarEcuacionContraldor  extends HttpServlet {
    
    private final EcuacionServicio servicioEcua = new EcuacionServicio();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        var listaCalculos = this.servicioEcua.buscarResultados();

        request.setAttribute("listaCalculos",listaCalculos);
 

        request.getRequestDispatcher("mostrar.jsp").forward(request, response);
    }


}
