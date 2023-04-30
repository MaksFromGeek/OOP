package org.example.CW5.student.repozitory;

import org.example.CW5.student.model.User;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class UserRepo {

    private List<User> db = new ArrayList<>(); // инициализировали List

    public UserRepo(List<User> db) {
        this.db = new ArrayList<>(); // LinkedList здесь не подходит
    }

    public UserRepo() {
    }

    public void addUserToRepo(User user) {
        db.add(user);
    }

    public void deleteFromRepo(User user) {
        db.remove(user);
    }

    public User getUserFromRepo(User user) { // void в данном случае не подходит
        for (User el : db){
            if (el.getUserID().equals(user.getUserID())){
                return el;
            }
        }
        return null;
    }

    public void saveUser(User user) {
        try (FileWriter fileWriter = new FileWriter("text.txt", true)) { // тру нужен, чтобы данные пользователя не перезаписывались в текстовом файле
            fileWriter.write(user.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
