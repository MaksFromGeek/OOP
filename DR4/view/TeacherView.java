package org.example.DR4.view;

import org.example.DR4.data.Teacher;
import org.example.DR4.data.User;

import java.util.List;

public class TeacherView implements UserView<Teacher>{
    @Override
    public Teacher sendOnConsole(List<User> userListlist) {
        return (Teacher) userListlist.get(0);
    }
}
