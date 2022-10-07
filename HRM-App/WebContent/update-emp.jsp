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
	<h1 align="center"> <u>Update Employee </u> </h1>	
	<% 
		String message = "";
		message = (String) session.getAttribute("returnMessage");
		
	%>
	
	<h4><%= message %></h4>
	<table style="border: 1px solid black;">
		<tr>
			<th style="border: 1px solid black;"> EmployeeID </th>
			<th style="border: 1px solid black;"> Name </th>
			<th style="border: 1px solid black;"> Salary </th>
			<th style="border: 1px solid black;"> DepartmentId </th>
			<th style="border: 1px solid black;"> MannagerId </th>
   		</tr>
   		
   		<% 
   			Employee e = null;
			e = (Employee) session.getAttribute("updateEmp");
		
		%>
   		
   		<tr>	
			<td style="border: 1px solid black;"><%= e.getId()%>   </td>
						
			<td style="border: 1px solid black;"><%= e.getName()%> </td>
						
			<td style="border: 1px solid black;"><%= e.getSalary()%> </td>
			
			<td style="border: 1px solid black;"><%= e.getDeptId()%> </td>
				
			<td style="border: 1px solid black;"><%= e.getManager_id()%> </td>
		</tr>
		
		
		
	</table> 
</body>
</html>