package com.naumdeveloper.spring.demo1;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DaoUserRepository implements UserRepository {
    @Override
    public List<User> findAllUsers() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void addUser(User user) {
        throw new UnsupportedOperationException();
    }
}
