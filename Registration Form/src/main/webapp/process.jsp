<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@page import="bean.RegisterDao"%>
	<%@page import="bean.User"%>
	 <%
	 User u=new User();
	 u.setFname(request.getParameter("Fname"));
	 u.setMname(request.getParameter("Mname"));
	 u.setLname(request.getParameter("Lname"));
	 u.setEmail(request.getParameter("Email"));
	 u.setPhone(request.getParameter("Phone"));
	 u.setGender(request.getParameter("Gender"));
	 u.setUserid(request.getParameter("Userid"));
	 u.setPassword(request.getParameter("Password"));
	  %>
	<%
	RegisterDao d=new RegisterDao();
	int status=d.register(u);
	if (status > 0)
		out.print("You are successfully registered");
	
	else
		out.print("UserId is already taken Try anathore one");
	%>
</body>
</html>