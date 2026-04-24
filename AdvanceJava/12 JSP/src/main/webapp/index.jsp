<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>JSP Scripting Elements Example</h2>
<form action="bill.jsp">
<table border="1" cellspacing="0">
	<tr>
		<th>S.No</th>
		<th>Category</th>
		<th>Quantity</th>
		<th>Price <br>(Per Unit)</th>
	</tr>
	<tr>
		<td>1</td>
		<td>Soap</td>
		<td>
			<input type="number" min=0 placeholder="Enter Quantity" name="q1"> 
		</td>
		<td>
			<input type="number" min=0 placeholder="Enter Price" name="p1"> 
		</td>
	</tr>
	
	<tr>
		<td>2</td>
		<td>Fairness Cream</td>
		<td>
			<input type="number" min=0 placeholder="Enter Quantity" name="q2"> 
		</td>
		<td>
			<input type="number" min=0 placeholder="Enter Price" name="p2"> 
		</td>
	</tr>
	
	
	<tr>
		<td></td>
		<td>GST</td>
		<td>
			<input type="number" min=0 placeholder="Enter GST" name="gst"> 
		</td>
		<td>
			<input type="submit" value="Calculate"> 
		</td>
	</tr>
</table>
</form>
</body>
</html>