package org.example.CW5.prepod.view;


import org.example.CW5.prepod.controller.UserController;

import java.util.Scanner;

public class UserView {
    public static void main(String[] args) {
        UserController userController = new UserController();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter ur data");
        userController.saveNewUser(scanner.nextLine(), scanner.nextInt());

    }
}
