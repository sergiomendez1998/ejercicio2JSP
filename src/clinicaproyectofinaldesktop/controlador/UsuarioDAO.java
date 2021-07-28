/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaproyectofinaldesktop.controlador;

import clinicaproyectofinaldesktop.modelo.Role;
import clinicaproyectofinaldesktop.modelo.Usuario;
import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Sergio_Mendez_G
 */
public class UsuarioDAO {

    private final Conexion co = new Conexion();
    private Usuario user;
    private final String getusers = "SELECT e.nombre, e.apellido, e.username, e.password, r.nombre_role FROM empleados e\n"
            + "INNER JOIN role r on r.id = e.id_role WHERE e.username=? AND e.password =?";

    public Usuario validarAcceso(String user, String pass) {
        Usuario users = null;
        Role rol = null;

        try (Connection connection = co.getConnection();
                PreparedStatement ps = connection.prepareStatement(getusers)) {

            ps.setString(1, user);
            ps.setString(2, pass);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                String n = rs.getString("nombre");
                String u = rs.getString("username");
                String p = rs.getString("password");
                String role = rs.getString("nombre_role");
                rol = new Role(role);
                  users = new Usuario(n, u, p, rol);

            }

            ps.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println(rol.getNombre());
        System.out.println(users.getNombre());
        return users;
    }

}
