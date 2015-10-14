package main.java.dao;


import java.util.List;

public interface ITemplateDAO<T> {
    void create(T entity);

    T getById(Integer entityId);

    List<T> getAll();

    void update(T entity);

    void delete(T entity);

    void deleteById(Integer entityId);
}
