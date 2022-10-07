package com.example.model;

import java.util.List;
import java.util.Optional;

public interface EmployeeDao {
    public List<Employee> findAll();
    public int register(Employee employee);
    public int remove(int id);
    public Optional<Employee> findById(int id);
}
