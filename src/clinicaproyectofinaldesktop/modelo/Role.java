/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaproyectofinaldesktop.modelo;

/**
 *
 * @author Sergio_Mendez_G
 */
public class Role {

    private int id;
    private String nombre;

    public Role() {
    }

    public Role(String nombre) {
        this.nombre = nombre;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
