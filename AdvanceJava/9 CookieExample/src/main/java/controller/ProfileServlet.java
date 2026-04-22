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

@WebServlet("/ProfileServlet")
public class ProfileServlet extends HttpServlet{
	protected void processRequest(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		PrintWriter out = response.getWriter();

//		RequestDispatcher rd = request.getRequestDispatcher("login.html");

		Cookie ck[] = request.getCookies();
		if(ck!=null) {
			for(Cookie cookie : ck) {
				if(cookie.getName().equals("email")) {
					out.print("<!Doctype html>");
					out.print("<html><head><title>Home</title></head>");
					out.print("<body><center><h2>Cookie Example</h2>");
					out.print("<hr width='300'>");
					out.print("Welcome "+cookie.getValue()+"	|    ");
					out.print("<a href=''>Home</a>	|     ");
					out.print("<a href='LogoutServlet'>Logout</a>");
					out.print("<hr width='300'>");
					out.print("<blockquote><h2>Profile Page</h2>Lorem Ipsum is a standard placeholder text used in printing, typesetting, and digital design to simulate readable content without distracting from layout.Lorem Ipsum is a standard placeholder text used in printing, typesetting, and digital design to simulate readable content without distracting from layout.Lorem Ipsum is a standard placeholder text used in printing, typesetting, and digital design to simulate readable content without distracting from layout.</blockquote>");
					out.print("</center></body></html>");
				}
			}
		}else {
			out.print("<script>alert('Please login first')</script>");
			RequestDispatcher rd = request.getRequestDispatcher("index.html");
			rd.include(request, response);
		}
//		if(email.equals("andrew@gmail.com") && password.equals("andrew@123")) {
//			Cookie cookie = new Cookie("email",email);
//			response.addCookie(cookie);
//			out.print("<script>alert('Credential Matched')</script>");
//			rd.include(request, response);
//		}
//		else {
//			out.print("<script>alert('Credential Not Matched')</script>");
//			rd.include(request, response);			
//		}
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
