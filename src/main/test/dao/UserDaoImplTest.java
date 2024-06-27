package dao;

import by.bratchykau.dao.UserDao;
import by.bratchykau.dao.UserDaoImpl;
import by.bratchykau.model.User;
import org.junit.Test;
import static org.junit.Assert.*;

public class UserDaoImplTest {
    @Test
    public void testAddAndGetUser() {
        UserDaoImpl userDao = new UserDaoImpl();
        User user = new User("testuser", "test@example.com", "password");

        userDao.addUser(user);
        User retrievedUser = userDao.getUser("testuser");

        assertNotNull(retrievedUser);
        assertEquals("testuser", retrievedUser.getUsername());
        assertEquals("test@example.com", retrievedUser.getEmail());
    }
}

