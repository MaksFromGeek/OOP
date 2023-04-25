package org.example.DR4.controller;

import org.example.DR4.data.User;
import java.time.LocalDate;

public interface UserController<T extends User>{
    void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);
}