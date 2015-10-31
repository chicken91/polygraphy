package main.java.service;

import main.java.model.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface IUserService {

    void createUser(User user);

    User getUserByName(String username);

    List<User> getAll();

    @Transactional
    void editUser(User user);

    @Transactional
    User getCurrentUser();

    @Transactional
    boolean validateSecurityPassword(String password);
}
