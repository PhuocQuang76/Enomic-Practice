package com.example.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Optional;

public class EmployeeDaoImpl implements EmployeeDao{
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<Employee> findAll() {
        String query = "select * from employee";
        List<Employee> employeeList =  jdbcTemplate.query(query,new BeanPropertyRowMapper(Employee.class));
        return employeeList;
    }

    @Override
    public int register(Employee e) {
        String query = "insert into employee values("+e.getId()+",'"+e.getName()+"',"+e.getSalary()+","+e.getDeptId()+","+e.getMgrId()+")";
        return jdbcTemplate.update(query);
    }

    @Override
    public int remove(int id) {
        String query = "delete from employee where emp_id = " + id + ";";
        int returnV = jdbcTemplate.update(query);
        return returnV;
    }

    @Override
    public Optional<Employee> findById(int id) {
        String sql ="SELECT * FROM employee WHERE emp_id = ?; ";
        return jdbcTemplate.query(sql,new EmployeeRowMapper(),id)
                .stream()
                .findFirst();

    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}


