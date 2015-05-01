package main.java.service;



import main.java.entity.User;

import java.util.List;


public interface UserService {

    void addUser(User user);
    User getUserByUsername(String username);
    boolean checkUser(User user);
}
