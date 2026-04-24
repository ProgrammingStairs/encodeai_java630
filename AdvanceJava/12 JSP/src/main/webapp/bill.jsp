<%-- This is an example of scripting elements in jsp --%>

<% 
	int q1 = Integer.parseInt(request.getParameter("q1"));
int p1 = Integer.parseInt(request.getParameter("p1"));
int q2 = Integer.parseInt(request.getParameter("q2"));
int p2 = Integer.parseInt(request.getParameter("p2"));
double gst = Double.parseDouble(request.getParameter("gst"));
%>

<%! 
	double calculate(int q1,int p1,int q2,int p2,double gst){
		int total = q1*p1+q2*p2;
		return 	total + total*gst/100;
	}
%>

<%= "Total :"+calculate(q1,p1,q2,p2,gst) %>
<% 
	out.print("Total : "+calculate(q1,p1,q2,p2,gst));
%>