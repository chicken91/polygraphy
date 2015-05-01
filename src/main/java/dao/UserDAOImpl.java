package main.java.dao;

import main.java.entity.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository("UserDAO")
public class UserDAOImpl extends HibernateDaoSupport implements UserDAO {

    @Autowired
    public void init(SessionFactory sessionFactory) {
        setSessionFactory(sessionFactory);
    }

	@Override
    @Transactional
	public void createUser(User user) {
		getHibernateTemplate().save(user);
	}

    @Override
    @Transactional
    public User readUserById(int id) {
        @SuppressWarnings("unchecked")
        List<User> list = (List<User>) getHibernateTemplate().find("from User where id=?", id);
        return list.get(0);
    }

	@Override
    @Transactional
	public void updateUser(User user) {
		getHibernateTemplate().update(user);
	}

	@Override
    @Transactional
	public void deleteUserById(int id) {
        @SuppressWarnings("unchecked")
        List<User> list = (List<User>) getHibernateTemplate().find("from User where id=?", id);
        getHibernateTemplate().delete(list.get(0));
	}

	@Override
    @Transactional
	public List<User> getAllUsers() {
		@SuppressWarnings("unchecked")
		List<User> list = (List<User>) getHibernateTemplate().find("from User");
		return list;
	}

    @Override
    @Transactional
    public User getUserByUsername(String username) {
        @SuppressWarnings("unchecked")
        List<User> list = (List<User>) getHibernateTemplate().find("from User where username=?", username);
        if(!list.isEmpty()){
            return list.get(0);
        } else {
           return null;
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    @Transactional
    public boolean hasUsername(String username) {
        return !getHibernateTemplate().find("from User user where user.username = ?", username).isEmpty();
    }

    @SuppressWarnings("unchecked")
    @Override
    @Transactional
    public boolean hasEmail(String email) {
        return !getHibernateTemplate().find("from User user where user.email = ?", email).isEmpty();
    }
}
