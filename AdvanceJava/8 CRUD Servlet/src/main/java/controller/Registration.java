package controller;

import java.io.IOException;
import java.io.PrintWriter;

import dao.UserDao;
import dto.User;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Registration")
public class Registration extends HttpServlet{
	
	protected void processRequest(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String username = request.getParameter("username");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String address = request.getParameter("address");

		User user = new User();
		user.setUsername(username);
		user.setEmail(email);
		user.setPassword(password);
		user.setAddress(address);
		
		UserDao userDao = new UserDao();
		int i = userDao.addUser(user);
		if(i>0) {
			RequestDispatcher rd = request.getRequestDispatcher("login.html");
			rd.forward(request, response);			
		}
		else {
			RequestDispatcher rd = request.getRequestDispatcher("register.html");
			rd.include(request, response);
			out.print("Error while making registration");
		}
	}

	@Override
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		processRequest(request,response);
	}

	@Override
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		processRequest(request,response);
	}

}
