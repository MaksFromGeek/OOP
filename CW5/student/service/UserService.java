package org.example.CW5.student.service;

import org.example.CW5.student.model.User;
import org.example.CW5.student.repozitory.UserRepo;

public class UserService { // можно добавить валидацию данных, например проверка является ли User == 0
    private UserRepo userRepo = new UserRepo();

    public void saveUser(User user) {
        userRepo.saveUser(user);
    }

    public void deleteFromRepo(User user) {
        userRepo.deleteFromRepo(user);
    }

    public User getUserFromRepo(User user) { // void здесь не подходит
        return userRepo.getUserFromRepo(user);
    }

    public void addUserToRepo(User user) {
        userRepo.addUserToRepo(user);
    }
}
