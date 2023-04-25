package org.example.DR4.view;

import org.example.DR4.data.User;

import java.util.List;

public interface UserView<T extends User> {
    T sendOnConsole(List<User> userListlist);
}
