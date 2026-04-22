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

@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet{
	protected void processRequest(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		PrintWriter out = response.getWriter();

		RequestDispatcher rd = request.getRequestDispatcher("login.html");

		Cookie ck[] = request.getCookies();
		if(ck!=null) {
			for(Cookie cookie : ck) {
				if(cookie.getName().equals("email")) {
					cookie.setMaxAge(0);
					response.addCookie(cookie);
				}
			}
		}
			out.print("<script>alert('Logout Successfully')</script>");
			rd.include(request, response);
		
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
