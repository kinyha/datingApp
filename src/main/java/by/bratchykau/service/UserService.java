package by.bratchykau.service;

import by.bratchykau.dao.UserDao;
import by.bratchykau.dao.UserDaoImpl;
import by.bratchykau.model.User;

public class UserService {
    private UserDaoImpl userDao;

    public UserService(UserDaoImpl userDao) {
        this.userDao = userDao;
    }

    public void registerUser(String username, String email, String password) {
        // Add validation logic here
        User user = new User(username, email, password);
        userDao.addUser(user);
    }
}
