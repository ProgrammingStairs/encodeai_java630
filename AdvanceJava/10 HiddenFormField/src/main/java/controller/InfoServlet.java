package controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/InfoServlet")
public class InfoServlet extends HttpServlet{
	protected void processRequest(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String username = request.getParameter("username");
		String email= request.getParameter("email");
		String password = request.getParameter("password");
		
		out.print("<form action='ViewInfo'>");
		out.print("<input type='hidden' value='"+username+"' name='username' id='username' placeholder='Enter Username'>");
		out.print("<input type='hidden' value='"+email+"' name='email' id='email' placeholder='Enter Email'>");
		out.print("<input type='hidden' value='"+password+"' name='password' id='password' placeholder='Enter Password'>");
		out.print("<input type='submit' value='Do you want to continue?'>");
		out.print("</form>");

		out.print("<br><a href='URLData?username="+username+"&email="+email+"&password="+password+"'>View Details</a>");
		
		out.print("<form action='index.html'>");
		out.print("<input type='submit' value='Want to cancle?'>");
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
