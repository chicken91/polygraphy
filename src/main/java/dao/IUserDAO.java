package main.java.dao;

import main.java.model.User;

public interface IUserDAO extends ITemplateDAO<User> {
    User getUserByName(String username);
}
