package org.example.DR6.view;

import org.example.DR6.data.Student;
import org.example.DR6.data.StudentGroup;
import org.example.DR6.data.User;

import java.util.List;
import java.util.logging.Logger;

public class StudentView implements UserView<Student> {

    Logger logger = Logger.getLogger(StudentView.class.getName());

    public void sendOnConsoleUserGroup(StudentGroup studentGroup){
        logger.info(studentGroup.toString());
    }

    @Override
    public Student sendOnConsole(List<User> userListlist) {
        return (Student) userListlist.get(0);
        }
}
