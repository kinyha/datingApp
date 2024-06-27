package servlet;

import by.bratchykau.dao.UserDao;
import by.bratchykau.model.User;
import by.bratchykau.servlet.RegistrationServlet;
import org.junit.Test;

import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistrationServletTest {
    @Test
    public void testDoPost() throws Exception {
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        UserDao userDao = mock(UserDao.class);

        when(request.getParameter("username")).thenReturn("testuser");
        when(request.getParameter("email")).thenReturn("test@example.com");
        when(request.getParameter("password")).thenReturn("password");

        RegistrationServlet servlet = new RegistrationServlet();
        //servlet.setUserDao(userDao);  // Assume we've added a setter for userDao
        servlet.doPost(request, response);

        //verify(userDao).addUser(any(User.class));
        verify(response).sendRedirect("login.jsp");
    }
}
