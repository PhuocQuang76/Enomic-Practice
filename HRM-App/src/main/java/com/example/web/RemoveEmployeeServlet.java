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

public class RemoveEmployeeServlet extends HttpServlet{
	

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		HttpSession s=req.getSession();
		EmployeeDao dao=EmployeeFactory.get();
		res.setContentType("text/html");
		int id=0;
		id=Integer.parseInt(req.getParameter("id"));
		
		int returnV = 0;

		try {
			
			returnV = dao.remove(id);
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
		}
		
//		pw.close();
		
		s.setAttribute("empRemoveId", id);
		s.setAttribute("returnValue", returnV);
	
		req.getRequestDispatcher("/remove-emp.jsp").forward(req, res);
	}

}
