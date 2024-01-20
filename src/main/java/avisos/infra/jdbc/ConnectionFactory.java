/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avisos.infra.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionFactory {
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/prova3", 
                    "root", "");
        } catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
