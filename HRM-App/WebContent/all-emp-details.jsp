<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="com.example.pojos.Employee"%>  
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
 
 <%@page import = "java.util.ArrayList" %>

 
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Employee Details</title>
</head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center"> <u>All Employee Details </u> </h1>
	<table style="border: 1px solid black;">
		<tr>
			<th style="border: 1px solid black;"> EmployeeID </th>
			<th style="border: 1px solid black;"> Name </th>
			<th style="border: 1px solid black;">Salary </th>
			<th style="border: 1px solid black;">DepartmentId </th>
			<th style="border: 1px solid black;">MannagerId </th>
   		</tr>
  
	<% 
//creating arraylist object of type category class
		Employee e = null;
		//storing passed value from jsp
		ArrayList<Employee> list =(ArrayList<Employee>) session.getAttribute("empList");
		
		
		for(int i = 0; i < list.size(); i++) {
		
		e = list.get(i);
		
%>

		<tr>
					
			<td style="border: 1px solid black;"><%= e.getId()%>  </td>
						
			<td style="border: 1px solid black;"> <%= e.getName()%>  </td>
						
			<td style="border: 1px solid black;"><%=  e.getSalary()%>  </td>
			
			<td style="border: 1px solid black;"><%=  e.getDeptId()%>  </td>
				
			<td style="border: 1px solid black;"><%=   e.getManager_id()%>  </td>
		</tr>
			
<%
		};
%>
  </table>
</body>
</html>