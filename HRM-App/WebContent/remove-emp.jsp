<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="com.example.pojos.Employee"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center"> <u>Remove Employee [#${empRemoveId}] } </u> </h1>	
	
	<% 
		String message = "";
		int id = (Integer) session.getAttribute("empRemoveId");
		int returnValue = (Integer) session.getAttribute("returnValue");
		if(returnValue != 0){
			message = "Employee with id: " + id + " was removed.";
		}
		else{
			message = "Can not remove employee  with id: " + id;
		}
	%>
	
	<h3><%= message %></h3>
</body>
</html>