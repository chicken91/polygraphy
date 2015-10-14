package main.java.service;

import main.java.dao.UserDAO;
import main.java.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service("UserService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public void addUser(User user) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        user.setPassword(encoder.encode(user.getPassword()));
        userDAO.createUser(user);
    }

    @Override
    public User getUserByUsername(String username) {
        return userDAO.getUserByUsername(username);
    }

    @Override
    public boolean checkUser(User user) {
        User userFromDB = userDAO.getUserByUsername(user.getUsername());
        if(userFromDB != null && new BCryptPasswordEncoder().matches(user.getPassword(), userFromDB.getPassword())){
            return true;
        } else {
            return false;
        }
    }

}
