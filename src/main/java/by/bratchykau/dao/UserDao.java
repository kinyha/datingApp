package by.bratchykau.dao;

import by.bratchykau.model.User;

public interface UserDao {
    void addUser(User user);
    User getUser(String username);
}
