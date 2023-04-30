package org.example.CW5.prepod.service;

import org.example.CW5.prepod.model.User;
import org.example.CW5.prepod.repozitory.UserRepo;

public class UserService {
    private UserRepo userRepo = new UserRepo();
    public void saveUser(User user){
        userRepo.saveUser(user);
    }
}
