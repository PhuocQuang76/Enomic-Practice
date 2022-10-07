package com.example.model;

import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;


public class EmployeeRowMapper implements RowMapper<Employee> {
    @Override
    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Employee(
                rs.getInt("EMP_ID"),
                rs.getString("NAME"),
                rs.getFloat("SALARY"),
                rs.getInt("DEPT_ID"),
                rs.getInt("MGR_ID")
        );
    }

}
