package com.example.model;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private int deptId;
    private int mgrId;

    public Employee() {}

    public Employee(int id, String name, double salary, int deptId, int mgrId) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.deptId = deptId;
        this.mgrId =  mgrId;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public int getDeptId() {
        return deptId;
    }
    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public int getMgrId() {
        return mgrId;
    }

    public void setMgrId(int mgrId) {
        this.mgrId = mgrId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", deptId=" + deptId +
                ", mgrId=" + mgrId +
                '}';
    }
}
