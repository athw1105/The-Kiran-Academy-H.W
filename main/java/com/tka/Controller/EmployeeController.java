package com.tka.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tka.Service.EmployeeService;
import com.tka.entities.Employee19;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService service;
	
	@PostMapping("/addemployee")
	public String insertData(@RequestBody Employee19 e) {
		String msg =service.insertData(e);
		return msg;
	}
	
	@DeleteMapping("/removeemp/{emp_Id}")
	public String deleteData(@PathVariable int emp_Id) {
		String msg=service.deleteData(emp_Id);
		return msg;
	}
	
	@PutMapping("/updateemp/{emp_Id}")
	public String updateData(@RequestBody Employee19 e,@PathVariable int emp_Id) {
		String msg=service.updateData(e,emp_Id);
		return msg;
	}
	
	@GetMapping("/fetchData")
	public List<Employee19> getAllData(){
		List<Employee19> list=service.getAllData();
		return list;
	}
	
	
}
