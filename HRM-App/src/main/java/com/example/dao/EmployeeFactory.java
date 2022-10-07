package com.example.dao;

import com.example.dao.EmployeeDao;
import com.example.dao.EmployeeDaoImpl;

public class EmployeeFactory {
	 public static EmployeeDao get() {
	        return new EmployeeDaoImpl();
	    }
}
