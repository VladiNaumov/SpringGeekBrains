package com.naumdeveloper.spring.demo1;

import java.util.List;

public interface UserRepository {
    List<User> findAllUsers();
    void addUser(User user);
}
