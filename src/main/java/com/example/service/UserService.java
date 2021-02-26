package com.example.service;

import com.example.dao.UserDAO;
import com.example.domain.User;

import java.time.Instant;
import java.util.List;



/**
 *  // TEST DOUBLES
 * DUMMY
 * STUBS
 * SPY
 * MOCK
 */
public class UserService {

    private UserDAO userDAO; // dependencia

    /**
     *
     * @return
     */
    public List<User> recuperarUsuarios(){

        // . ...

        List<User> users = userDAO.findAll();
        // users = userDAO.findAll();
        // ....

        return users;

    }

    public User findOne(Long id){

        // UTC  --- Europe/Madrid

        // .....
        User user =  userDAO.findOne(id);
        user.setAccessedDate(Instant.now());
        System.out.println(user.getAccessedDate());
        // code ...

        // .. ..
        return user;
    }


}