package by.bratchykau.servlet;

import by.bratchykau.dao.UserDaoImpl;
import by.bratchykau.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * Handles user registration requests.
 * This servlet validates user input, creates a new user account,
 * and redirects to the login page upon successful registration.
 */
@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {
    private UserService userService;

    @Override
    public void init() throws ServletException {
        UserDaoImpl userDao = new UserDaoImpl();
        this.userService = new UserService(userDao);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        try {
            userService.registerUser(username, email, password);
            response.sendRedirect("login.jsp");
        } catch (Exception e) {
            request.setAttribute("error", e.getMessage());
            request.getRequestDispatcher("register.jsp").forward(request, response);
        }
        //ad
    }
}
