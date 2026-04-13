package controller;

import java.io.IOException;
import java.io.PrintWriter;

import dao.UserDao;
import dto.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/UpdateForm")
public class UpdateForm extends HttpServlet{
	protected void processRequest(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException {
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		String email = (String)(session.getAttribute("email"));
		
		UserDao dao = new UserDao();
		User user = dao.getUserDetails(email);
		
		out.print("<!Doctype html>");
		out.print("<html><head><title>Home</title></head>");
		out.print("<body><center><h2>Servlet CRUD operation</h2>");
		out.print("<hr width='300'>");
		out.print("Welcome "+email+"	|    ");
		out.print("<a href=''>Home</a>	|     ");
		out.print("<a href='UpdateForm'>Update Profile</a>	|");
		out.print("<a href=''>Logout</a>");
		out.print("<hr width='300'>");
		out.print("<blockquote><h2>Update Profile</h2>");
		out.print("<form action='UpdateFormData'>");
		out.print("<input value='"+user.getUsername()+"' type='text' placeholder='Enter Username' id='username' name='username' required> <br>");
		out.print("<input readonly value='"+user.getEmail()+"' type='email' placeholder='Enter Email' id='email' name='email' required> <br>");
		out.print("<input value='"+user.getPassword()+"' type='password' placeholder='Enter Password' id='password' name='password' required> <br>");
		out.print("<input value='"+user.getAddress()+"' type='text' placeholder='Enter Address' id='address' name='address' required> <br>");
		out.print("<input type='submit' value='Update'>");
		out.print("<input type='reset' value='Reset'>");
		out.print("<br></form>");

		out.print("</center></body></html>");
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
