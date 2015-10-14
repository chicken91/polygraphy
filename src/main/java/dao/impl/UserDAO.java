package main.java.dao.impl;

import main.java.dao.IUserDAO;
import main.java.model.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate4.SessionFactoryUtils;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userDAO")
public class UserDAO extends TemplateDAO<User> implements IUserDAO {

    public UserDAO() {
        super(User.class);
    }

    @Override
    public User getUserByUsername(String username) {
        Session session = getSessionFactory().openSession();
        try {
            Query query = session.createSQLQuery(
                    "SELECT * FROM users WHERE username = :username")
                    .addEntity(User.class)
                    .setString("username", username);
            List<User> result = query.list();
            return result.size() > 0 ? result.get(0) : null;
        } finally {
            SessionFactoryUtils.closeSession(session);
        }
    }
}
