package com.tka.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee19 {
	@Id
	private int emp_Id;
	private String name;
	private String city;
	private String department;
	private int salary;
	@Override
	public String toString() {
		return "Employee19 [emp_Id=" + emp_Id + ", name=" + name + ", city=" + city + ", Salary=" + salary
				+ ", department=" + department + "]";
	}
	
	public Employee19() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee19(int emp_Id, String name, String city, int salary, String department) {
		super();
		this.emp_Id = emp_Id;
		this.name = name;
		this.city = city;
		this.salary = salary;
		this.department = department;
	}
	
	public int getEmp_Id() {
		return emp_Id;
	}
	public void setEmp_Id(int emp_Id) {
		this.emp_Id = emp_Id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
}
