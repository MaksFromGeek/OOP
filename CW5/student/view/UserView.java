package org.example.CW5.student.view;

import org.example.CW5.student.controller.UserController;
import org.example.CW5.student.model.User;

import java.util.Scanner;

/**
 * Реализовать операции изменения данных, удаления и получения всех пользователей
 * (обращаемся к репозиторию через сервис, т.е. из view идем в controller, controller обращается к service,
 * service проводит работу с репозиторием. Из сервиса направляемся в контроллер и от туда во view
 */
public class UserView {
    public static void main(String[] args) {
        UserController userController = new UserController();
        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter ur data");
//        userController.saveNewUser(scanner.nextInt(), scanner.next(), scanner.nextInt());

        User user1 = new User(3, "name3" , 33);
        userController.addUserToRepo(user1);
        System.out.println(userController.getUser(user1));
        userController.deleteUser(user1);
        System.out.println(userController.getUser(user1));
    }
}
