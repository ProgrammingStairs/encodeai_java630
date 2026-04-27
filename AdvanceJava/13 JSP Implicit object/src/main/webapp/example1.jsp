<%
	String email = request.getParameter("email");
	String password= request.getParameter("password");
	
%>
<%--	
	if(email.equals("andrew@gmail.com") && password.equals("andrew@123")){
		session.setAttribute("email",email);
		response.sendRedirect("home.jsp");
	}else{
		response.sendRedirect("index1.html");
	}
--%>

<%
	if(email.equals("andrew@gmail.com") && password.equals("andrew@123")){
		pageContext.setAttribute("email",email,PageContext.SESSION_SCOPE);
		response.sendRedirect("home.jsp");
	}else{
		response.sendRedirect("index1.html");
	}
%>