package org.example.DR4.view;

import org.example.DR4.data.Student;
import org.example.DR4.data.StudentGroup;
import org.example.DR4.data.User;

import java.util.List;
import java.util.logging.Logger;

public class StudentView implements UserView<Student> {

    Logger logger = Logger.getLogger(StudentView.class.getName());

    public void sendOnConsoleUserGroup(StudentGroup studentGroup){
        logger.info(studentGroup.toString());
    }
    public Student sendOnConsole(List<User> userListlist) {
        return (Student) userListlist.get(0);
        }
}
