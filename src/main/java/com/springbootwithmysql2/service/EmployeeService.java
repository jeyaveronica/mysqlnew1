package com.springbootwithmysql2.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springbootwithmysql2.entity.Employee;

@Service

public interface EmployeeService {
	//create table
	public Employee createEmp(Employee emp);
	// get table
	public List<Employee> getEmployees();
	
	// accessing through id
	public Employee getEmployee(int id);

}
