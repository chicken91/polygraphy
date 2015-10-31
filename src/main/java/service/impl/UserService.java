package main.java.service.impl;

import main.java.dao.impl.UserDAO;
import main.java.model.User;
import main.java.service.IUserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("userService")
public class UserService implements IUserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    @Transactional
    public void createUser(User user) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        user.setPassword(encoder.encode(user.getPassword()));
        userDAO.create(user);
    }

    @Override
    @Transactional
    public User getUserByName(String username) {
        return userDAO.getUserByName(username);
    }

    @Override
    @Transactional
    public List<User> getAll() {
        return userDAO.getAll();
    }

    @Override
    @Transactional
    public void editUser(User user) {
        user.setPassword(encodePassword(user.getPassword()));
        userDAO.update(user);
    }

    @Override
    @Transactional
    public User getCurrentUser() {
        return userDAO.getUserByName(SecurityContextHolder.getContext().getAuthentication().getName());
    }

    @Override
    public boolean validateSecurityPassword(String password) {
        if (StringUtils.isBlank(password)) {
            throw new IllegalArgumentException("Security password is empty!");
        }
        return new BCryptPasswordEncoder().matches(password, getCurrentUser().getPassword());
    }

    private String encodePassword(String userPassword) {
        if (StringUtils.isBlank(userPassword)) {
            throw new IllegalArgumentException("Password is empty!");
        }
        return new BCryptPasswordEncoder().encode(userPassword);
    }
}
