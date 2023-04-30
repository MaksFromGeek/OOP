package org.example.CW5.student.controller;

import org.example.CW5.student.model.User;
import org.example.CW5.student.service.UserService;

public class UserController { // собирает модели
    private UserService userService = new UserService();

    public void saveNewUser(Integer UserID, String name, int age) {
        userService.saveUser(new User(1, name, age)); // значения наших переменных
    }

    public void deleteUser(User user) {
        userService.deleteFromRepo(user);
    }

    public User getUser(User user) { // для вывода на консоль
        return userService.getUserFromRepo(user);
    }

    public void addUserToRepo(User user) {
        userService.addUserToRepo(user);
    }
}
