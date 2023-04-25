package org.example.CW4.view;

import org.example.CW4.data.Student;

import java.util.List;
import java.util.logging.Logger;

public class StudentView implements UserView<Student> {

    Logger logger = Logger.getLogger(UserView.class.getName());

    public Student sendOnConsole(List<Student> userList) {
        return (Student) userList.get(0);
        }
}
