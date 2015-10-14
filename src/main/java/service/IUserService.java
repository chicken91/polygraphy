package main.java.service;

import main.java.model.User;

public interface IUserService {

    void createUser(User user);

    User getUserByUsername(String username);
}
