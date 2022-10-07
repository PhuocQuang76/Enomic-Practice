package com.example.services;

import java.util.List;


import javax.ws.rs.Produces;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.example.dao.EmployeeDao;
import com.example.dao.EmployeeException;
import com.example.pojos.Employee;



@Stateless @Path("emp-rest")
public class EmployeeRS {
	@EJB
	 private EmployeeDao dao;

	@GET
	@Path("/{name}")
	public String get(@PathParam("name") String name) {
		//write a program to determine greeting message according to system time
		return "Good Evening "+name;
	}
	
	
	@GET
	@Path("find/{id}") @Produces("application/json")
	public Employee find(@PathParam("id") int id) throws EmployeeException {
		return dao.findById(id);
	}
	
	@GET
	@Path("all")  @Produces("application/json")
	public List<Employee> find() throws EmployeeException {
		return dao.findAll();
	}
	
	 @DELETE
	 @Path("delete/{id}") 
	 public int delete(@PathParam("id") int id) throws EmployeeException {
	       return dao.remove(id);
	 }
	


}