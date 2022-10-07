package com.example.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.pojos.Department;
import com.example.pojos.Employee;
import com.mysql.cj.Query;

public class EmployeeDaoImpl2 implements EmployeeDao{

	public SessionFactory getConnection() throws SQLException{
		SessionFactory f=new Configuration().configure("/com/example/hibernate.cfg.xml").buildSessionFactory();
		return f;
		
	}
	
	@Override
	public List<Employee> findAll() throws EmployeeException {
		List<Employee> ls=null;
		
		try(SessionFactory sf=getConnection();
				Session s=sf.openSession()) {
			  Query q=(Query) s.createNamedQuery("findAll", Employee.class);
			 
			  ls=((org.hibernate.query.Query<Employee>) q).getResultList();
			  
		}catch(Exception ex) {
			throw new EmployeeException(ex.getMessage(),ex);
		}
		
		return ls;
	}

	@Override
	public String register(Employee emp) throws EmployeeException {
		String message=null;
		try(SessionFactory sf=getConnection();
				Session s=sf.openSession()) {
			   try {
					s.getTransaction().begin();
						s.save(emp);
					
				
					s.getTransaction().commit();
					message=emp.getName()+", you are registered";
			   }catch(Exception ex) {
				   s.getTransaction().rollback();
				   message="Something went wrong while inserting record:"+ex.getMessage();
			   }
		}catch (HibernateException e) {
			// TODO Auto-generated catch block
			message="Something went wrong while inserting record:"+e.getMessage();
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			message="Something went wrong while inserting record:"+e.getMessage();
		}
		
		return message;
	}
	public Employee findById(int id) throws EmployeeException {
		Employee emp=new Employee();
		
		try(SessionFactory sf=getConnection();
				Session s=sf.openSession()) {
			emp=s.load(Employee.class, id);
			//emp=s.get(Employee.class, id);
			
		}catch (HibernateException e) {
			// TODO Auto-generated catch block
			//throw new EmployeeException(e.getMessage(),e);
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new EmployeeException(e.getMessage(),e);
		}
		
		return emp;
	}

	public Department findDepartment(int id) throws EmployeeException {
		Department d=null;
		
		try(SessionFactory sf=getConnection();
				Session s=sf.openSession()) {
			d=s.get(Department.class, id);
			
		}catch (HibernateException e) {
			// TODO Auto-generated catch block
			throw new EmployeeException(e.getMessage(),e);
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new EmployeeException(e.getMessage(),e);
		}
		
		return d;
	}


}
