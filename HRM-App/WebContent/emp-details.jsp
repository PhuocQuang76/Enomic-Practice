 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="com.example.pojos.Employee"%>  
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Details</title>
</head>
<body>
	<h1 align="center"> <u>Employee Details [ #${empid} ]</u> </h1>
	
	
	<table style="border: 1px solid black;">
		<tr>
			<th style="border: 1px solid black;"> EmployeeID </th>
			<th style="border: 1px solid black;"> Name </th>
			<th style="border: 1px solid black;">Salary </th>
			<th style="border: 1px solid black;">DepartmentId </th>
			<th style="border: 1px solid black;">MannagerId </th>
   		</tr>
   		
	<c:if test="empty ${emp}"> 
		<p>Employee with Id <b>${empid}</b> doesnt exist </p>	
	</c:if>
		
	<!--  //comment  -->
	
		<tr>
					
			<td style="border: 1px solid black;">${emp.id}  </td>
						
			<td style="border: 1px solid black;">${emp.name}</td>
						
			<td style="border: 1px solid black;">${emp.salary}</td>
			
			<td style="border: 1px solid black;">${emp.deptId}</td>
				
			<td style="border: 1px solid black;">${emp.manager_id}</td>
			
		</tr>
	</table>
	
	<%
	     
		//	out.println("<p><b> Employee with Id "+ empid+" doesnt exist");
		
	%>
	
	
</body>
</html> 