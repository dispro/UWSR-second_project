package ru.leverx.egorov.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface DAO<T> {
    Optional<T> find(Long id) throws SQLException;
    void save(T model) throws SQLException;
    void update(T model);
    void delete(Long id) throws SQLException;

    List<T> findAll() throws SQLException;
}
