package main.java.dao;

import java.util.List;
import main.java.model.User;

public interface UserDAO {
    void createUser(User user);
    User readUserById(int id);
    void updateUser(User user);
    void deleteUserById(int id);
    List<User> getAllUsers();
    User getUserByUsername(String username);
    boolean hasUsername(String username);
    boolean hasEmail(String email);
}
