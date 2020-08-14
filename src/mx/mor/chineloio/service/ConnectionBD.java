/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.mor.chineloio.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author PCio
 */
public class ConnectionBD {

    /**
     * Function thath make the connection to database.
     *
     * @return Connection for Database
     * @throws SQLException Error for connect to Database
     */
    public Connection getConexion() throws SQLException, InstantiationException, IllegalAccessException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
//        jdbc:mysql://localhost/db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC
        return DriverManager.getConnection("jdbc:mysql://localhost/pdv?characterEncoding=utf-8&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "root");
    }

//    public static void main(String[] args) throws SQLException, InstantiationException, IllegalAccessException {
//        if (new ConnectionBD().getConexion() != null) {
//            System.out.println("Exito");
//        } else {
//            System.out.println("Error");
//        }
//    }
}
