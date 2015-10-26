package main.java.service;

import main.java.model.User;

import java.util.List;

public interface IUserService {

    void createUser(User user);

    User getUserByName(String username);

    List<User> getAll();
}
