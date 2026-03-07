package com.controller;

import com.service.EmployeeService;

public class EmployeeController {
	public static void main(String[] args) {
		EmployeeService service=new EmployeeService();
		//service.insertData();
		//service.show();
		//service.update();
		service.delete();
	}
}
