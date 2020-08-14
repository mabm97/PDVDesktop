/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.mor.chineloio.dao.product;

import mx.mor.chineloio.entity.User;

/**
 *
 * @author PCio
 */
public class DaoUser {

    public User getUserSession() {
        return new User("69", "1", "13/08/2020", "13/08/2020", "Comercial María Félix", "comercialmariafelix@hotmail.com.com", "password", "1");
    }

}
