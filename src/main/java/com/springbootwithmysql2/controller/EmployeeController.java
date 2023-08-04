package com.springbootwithmysql2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.springbootwithmysql2.entity.Employee;
import com.springbootwithmysql2.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	@PostMapping("/save")
	public Employee saveEmployee( @RequestBody Employee emp) {
		return service.createEmp(emp);
		
	}
	@GetMapping("/getemps")
	public List<Employee> getEmps() {
		return service.getEmployees();
	}
	@GetMapping("/getemp/{id}") 
	public Employee getEmployee(@PathVariable int id) {
		return service.getEmployee(id);
	}
	

}
