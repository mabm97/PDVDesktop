/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.mor.chineloio.dao.product;

import java.sql.Connection;
import java.sql.SQLException;
import mx.mor.chineloio.entity.Product;
import mx.mor.chineloio.service.ConnectionBD;

/**
 *
 * @author PCio
 */
public class DaoProduct {

    private void saveProduct(Product producto) throws SQLException, InstantiationException, IllegalAccessException, Exception {
        if (producto == null) {
            throw new NullPointerException("El Producto no cuenta con información correcta.");
        }
        Connection con = null;
        // <editor-fold defaultstate="collapsed" desc="Get Connection">
        try {
            con = new ConnectionBD().getConexion();
        } catch (SQLException exception) {
            throw new SQLException("Ocurrió un error al inicializar la Base de Datos.", exception);
        } catch (Exception exception) {
            throw new Exception("Ocurrió un error al inicializar la Base de Datos.", exception);
        }
        // </editor-fold>        

        // <editor-fold defaultstate="collapsed" desc="Get Connection">
        con.setAutoCommit(false);
        try {

        } catch (Exception e) {
            
        }

        // <editor-fold defaultstate="collapsed" desc="Get Connection">
    }

}
