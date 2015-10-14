package main.java.dao.impl;


import main.java.dao.ITemplateDAO;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public abstract class TemplateDAO<T> extends HibernateDaoSupport implements ITemplateDAO<T> {

    private Class<T> mEntityClass;

    public TemplateDAO(Class<T> entityClass) {
        mEntityClass = entityClass;
    }

    @Autowired
    public void init(SessionFactory factory) {
        setSessionFactory(factory);
    }

    @Override
    public void create(T entity) {
        getHibernateTemplate().saveOrUpdate(entity);
    }

    @Override
    public T getById(Integer entityId) {
        return getHibernateTemplate().get(mEntityClass, entityId);
    }

    @Override
    public List<T> getAll() {
        return getHibernateTemplate().loadAll(mEntityClass);
    }

    @Override
    public void update(T entity) {
        getHibernateTemplate().saveOrUpdate(entity);
    }

    @Override
    public void delete(T entity) {
        if (entity != null) {
            getHibernateTemplate().delete(entity);
        }
    }

    @Override
    public void deleteById(Integer entityId) {
        delete(getById(entityId));
    }
}
