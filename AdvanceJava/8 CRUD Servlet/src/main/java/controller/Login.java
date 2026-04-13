package controller;

import java.io.IOException;
import java.io.PrintWriter;

import dao.UserDao;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/Login")
public class Login extends HttpServlet{
	protected void processRequest(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException {
		PrintWriter out = response.getWriter();
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		UserDao dao = new UserDao();
		int i = dao.checkUser(email, password);
		if(i>0) {
			HttpSession session = request.getSession();
			session.setAttribute("email", email);
			RequestDispatcher rd = request.getRequestDispatcher("Profile");
			rd.forward(request, response);	
		}else {
			RequestDispatcher rd = request.getRequestDispatcher("login.html");
			rd.include(request, response);
			out.print("<center style='color:red'>Credential not matched</center>");
		}
	}
	@Override
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException {
		processRequest(request,response);
	}
	@Override
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException {
		processRequest(request,response);
	}
}
