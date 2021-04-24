/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Ecuacion;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class EcuacionServicio {

    public static List<Ecuacion> ecuacionResultados = new ArrayList<>();

    public List<Ecuacion> buscarResultados() {
        return ecuacionResultados;
    }
    
    
     public void agregarResultados(Ecuacion  ecuaciones) {    
         
         ecuacionResultados.add(ecuaciones);
   
    }
     
     

}
