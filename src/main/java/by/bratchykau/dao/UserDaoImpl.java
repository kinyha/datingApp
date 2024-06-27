package by.bratchykau.dao;

import by.bratchykau.model.User;

import java.util.HashMap;
import java.util.Map;

public class UserDaoImpl {


    private Map<String, User> users = new HashMap<>();

    public void addUser(User user) {
        users.put(user.getUsername(), user);
    }

    public User getUser(String username) {
        return users.get(username);
    }


}
