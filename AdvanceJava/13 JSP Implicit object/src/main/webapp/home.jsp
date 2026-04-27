<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- 
		String email = (String)session.getAttribute("email");	
	--%>
	<% 
		String email = (String)pageContext.getAttribute("email",PageContext.SESSION_SCOPE);	
	%>
	<h2>Welcome <%= email  %></h2>
</body>
</html>