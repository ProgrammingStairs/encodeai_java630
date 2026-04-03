package mypack;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class ServletDemo2 extends GenericServlet{
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("Servlet creation by extending GenericServlet class");
	}
}
