<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import="bean.*"%>
	<%@page import="java.util.*"%>
	<% 
	 String id=request.getParameter("id");
	String name;
	name=(String)session.getAttribute("Userid");
	out.println(name);
	orderdetails od=new orderdetails();
	od.setUserid(name);
	od.setPid(id);
	Ordered odr= new Ordered();
	odr.placeorder(od); 
	%>
		<%out.println("gdsyg"); %>
</body>
</html>