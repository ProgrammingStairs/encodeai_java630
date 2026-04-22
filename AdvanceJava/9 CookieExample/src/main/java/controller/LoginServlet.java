package controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet{
	protected void processRequest(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		PrintWriter out = response.getWriter();
		String email = request.getParameter("email");
		String password= request.getParameter("password");
		
		RequestDispatcher rd = request.getRequestDispatcher("login.html");
		if(email.equals("andrew@gmail.com") && password.equals("andrew@123")) {
			Cookie cookie = new Cookie("email",email);
			cookie.setMaxAge(720000);
			response.addCookie(cookie);
			out.print("<script>alert('Credential Matched')</script>");
			rd.include(request, response);
		}
		else {
			out.print("<script>alert('Credential Not Matched')</script>");
			rd.include(request, response);			
		}
	}
	@Override
protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		processRequest(request, response);
	}
	@Override
protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		processRequest(request, response);
	}
}
