package com.example.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.dao.EmployeeDao;
import com.example.dao.EmployeeException;
import com.example.dao.EmployeeFactory;
import com.example.pojos.Employee;

public class RegisterEmployeeServlet extends HttpServlet{
	

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		HttpSession s=req.getSession();
		EmployeeDao dao=EmployeeFactory.get();
		res.setContentType("text/html");
		
		Employee emp = new Employee( 9,"Micheal", 2000.32, 102, 5);
		
		String message = "";
		try {
			
			message = dao.register(emp);
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
		}
		
//		pw.close();
		
		s.setAttribute("emAdded", emp);
		s.setAttribute("returnMessage", message);
	
		req.getRequestDispatcher("/register-emp.jsp").forward(req, res);
	}
}

