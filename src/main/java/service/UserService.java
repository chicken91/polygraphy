package main.java.service;

import main.java.model.User;

public interface UserService {

    void addUser(User user);
    User getUserByUsername(String username);
    boolean checkUser(User user);
}
