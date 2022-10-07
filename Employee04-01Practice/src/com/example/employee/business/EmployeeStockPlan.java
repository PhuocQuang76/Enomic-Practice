package com.example.employee.business;

import com.example.employee.domain.Director;
import com.example.employee.domain.Employee;
import com.example.employee.domain.Manager;

public class EmployeeStockPlan {

    public int grantStock(Employee employee){
        int numberOfStock;
        if(employee instanceof Director){
            numberOfStock = 1000;
        }else if(employee instanceof Manager){
            numberOfStock = 100;
        }else{
            numberOfStock = 10;
        }
        return numberOfStock;
    }
}
