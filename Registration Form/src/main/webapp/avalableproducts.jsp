<%@page import="com.mysql.cj.xdevapi.Statement"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import="bean.productdetails" %>
<%@page import="java.util.*" %>
<div class="container">
<%ArrayList<productdetails> p = 
            (ArrayList<productdetails>)request.getAttribute("product");
            
            for(productdetails products:p)
            {%>
            	<div class="Photo">
            	
            	</div>
            	<div class="name">
            	<p id="name"><%= products.getName()%></p>
            	</div>
            	<div class="description">
            		<p id="description"><%= products.getDescripation() %>
            	</div>
            	<div class="price">
            		<p id="price"><%= products.getPrice() %>
            	</div>
            	<div class="type">
            		<p id="type"><%= products.getType() %>
            		
            	</div>
            	
            <% }%>
            
            
 </div>

</body>
</html>