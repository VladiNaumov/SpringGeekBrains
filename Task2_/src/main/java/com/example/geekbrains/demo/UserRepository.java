package com.example.geekbrains.demo;

import java.util.Collections;
import java.util.List;

public interface UserRepository {
    List<User> findAllUsers();
    void addUser(User user);
}
