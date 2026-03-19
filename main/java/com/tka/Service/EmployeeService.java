package com.tka.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.Dao.EmployeeDao;
import com.tka.entities.Employee19;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDao dao;
	
	public String insertData(Employee19 e) {
		String msg=dao.insertData(e);
		return msg;
	}
	
	public String deleteData(int emp_Id) {
		String msg=dao.deleteData(emp_Id);
		return msg;
	}
	
	public String updateData(Employee19 e,int emp_Id) {
		String msg=dao.updateData(e,emp_Id);
		return msg;
	}
	
	public List<Employee19> getAllData(){
		List<Employee19> list=dao.getAllData();
		return list;
	}
}
