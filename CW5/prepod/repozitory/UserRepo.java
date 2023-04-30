package org.example.CW5.prepod.repozitory;

import org.example.CW5.prepod.model.User;

import java.io.FileWriter;

public class UserRepo {
    public void saveUser(User user){
        try(FileWriter fileWriter = new FileWriter("text.txt", true)) { // тру нужен, чтобы данные пользователя не перезаписывались в текстовом файле
            fileWriter.write(user.toString());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
