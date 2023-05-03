package org.example.DR6.view;

import org.example.DR6.data.User;

import java.util.List;

public interface UserView<T extends User> {
    T sendOnConsole(List<User> userListlist);
}
