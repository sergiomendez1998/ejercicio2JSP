/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

/**
 *
 * @author Sergio_Mendez_G
 */
public class Conexion {

    String BD = "jdbc:postgresql://localhost:5432/postgres";
    String user = "postgres";
    String pass = "$ergio1007+";

    public  Connection getConnection() {

        Connection connection = null;

        try {

            connection = DriverManager.getConnection(BD, user, pass);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al conectar");
        }
        return connection;
    }

}
