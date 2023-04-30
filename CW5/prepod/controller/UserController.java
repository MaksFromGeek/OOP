package org.example.CW5.prepod.controller;

import org.example.CW5.prepod.model.User;
import org.example.CW5.prepod.service.UserService;

public class UserController {
    private UserService userService = new UserService();
    public void saveNewUser(String name, int age){
        userService.saveUser(new User(name, age));
    }
}
