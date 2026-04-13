package controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/Profile")
public class Profile extends HttpServlet{
	protected void processRequest(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException {
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		String email = (String)(session.getAttribute("email"));
		out.print("<!Doctype html>");
		out.print("<html><head><title>Home</title></head>");
		out.print("<body><center><h2>Servlet CRUD operation</h2>");
		out.print("<hr width='300'>");
		out.print("Welcome "+email+"	|    ");
		out.print("<a href=''>Home</a>	|     ");
		out.print("<a href='UpdateForm'>Update Profile</a>	|");
		out.print("<a href=''>Logout</a>");
		out.print("<hr width='300'>");
		out.print("<blockquote><h2>Profile Page</h2>Lorem Ipsum is a standard placeholder text used in printing, typesetting, and digital design to simulate readable content without distracting from layout.Lorem Ipsum is a standard placeholder text used in printing, typesetting, and digital design to simulate readable content without distracting from layout.Lorem Ipsum is a standard placeholder text used in printing, typesetting, and digital design to simulate readable content without distracting from layout.</blockquote>");
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
