package mypack;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class ServletDemo1 implements Servlet{
	
	ServletConfig config = null;
	
	@Override
	public void init(ServletConfig config) {
		this.config = config;
	}
	
	@Override
	public void service(ServletRequest request,ServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("This is an example of servlet creation by <h2>implementing Servlet Interface</h2>");
	}
	
	@Override
	public void destroy() {}
	
	@Override
	public String getServletInfo() {
		return "Created by Advance Batch";
	}
	
	@Override
	public ServletConfig getServletConfig() {
		return config;
	}
}

/*
Step-by-Step (Add Server Runtime)
🧭 Step 1: Open Project Properties
Right-click your project
Click Properties
⚙️ Step 2: Go to Targeted Runtimes
In left panel → Click Targeted Runtimes
You will see a list of servers
➕ Step 3: Select or Add Server
✔ If Tomcat is already listed:
Just check the checkbox (e.g., Apache Tomcat v9.0)
Click Apply → OK
❗ If Tomcat is NOT listed:
Click New Runtime

Select:

Apache → Apache Tomcat v9.0 (or v10)

Click Next
Browse and select your Tomcat installation folder
(where you extracted Tomcat)
Click Finish
Now check the server
Click Apply → OK
*/