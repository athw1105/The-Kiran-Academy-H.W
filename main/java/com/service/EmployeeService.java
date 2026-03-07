package com.service;

import com.dao.EmployeeDao;

public class EmployeeService {
	public void insertData() {
		EmployeeDao dao=new EmployeeDao();
		dao.insert();
	}
	
	public void show() {
		EmployeeDao dao=new EmployeeDao();
		dao.fetch();
	}
	
	public void update() {
		EmployeeDao dao=new EmployeeDao();
		dao.updaterecord();
	}
	
	public void delete() {
		EmployeeDao dao=new EmployeeDao();
		dao.deletedao();
	}
}
