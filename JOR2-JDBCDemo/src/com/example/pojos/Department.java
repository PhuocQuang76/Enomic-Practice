package com.example.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
import java.util.List;

@Entity 

public class Department {
	@Id
	@Column(name="DEPT_ID")
	private int id;
	private String name;
	private  String location;
	
	@OneToMany(mappedBy="dept", fetch=FetchType.EAGER)
	private List<Employee> emplist;

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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Employee> getEmplist() {
		return emplist;
	}

	public void setEmplist(List<Employee> emplist) {
		this.emplist = emplist;
	}

	
	
	
}
