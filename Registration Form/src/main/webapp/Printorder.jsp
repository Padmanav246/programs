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
	<div class="alliteams">
	<%="we are in printcart jsp"%>
	<%
	String Userid = (String) session.getAttribute("Userid");
	System.out.println("userid" + Userid);
	printcart or = new printcart();
	System.out.println("8888");
	ArrayList<String> cart = or.printcart2(Userid);
	System.out.println("9999");
	%>
	
	
	<%
			for (String order : cart) {
				out.println("hii");
			%>
		<%
		out.println(order);
		selectproduct sp = new selectproduct();
		productdetails pd = sp.getproduct(order);
		%>
		<div class="name">
		
		<h2><%=pd.getName()%></h2>
		
	</div>
	<div class="description">
		<p id="description"><%=pd.getDescripation()%></p>
	</div>
	<div class="last">
		<div class="price">
		
			<h2><%=pd.getPrice()%></h2>
			
		</div>
		<div class="type">
			<h2><%=pd.getType()%></h2>

		</div>
	</div>
</div>
		
<%
		}
		%>
	

</body>
</html>