package controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/URLData")
public class URLData extends HttpServlet{
	protected void processRequest(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String username = request.getParameter("username");
		String email= request.getParameter("email");
		String password = request.getParameter("password");
		
		out.print("<br>Username : "+username);
		out.print("<br>Email : "+email);
		out.print("<br>Password : "+password);
		
		out.print("<form action='index.html'>");
		out.print("<input type='submit' value='Go Back'>");
		out.print("</form>");
		
	}
	
	@Override
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		processRequest(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		processRequest(request, response);
	}
}
