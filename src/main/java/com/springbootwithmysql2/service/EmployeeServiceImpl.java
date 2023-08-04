package com.springbootwithmysql2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootwithmysql2.entity.Employee;
import com.springbootwithmysql2.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeRepository repo;
	public Employee createEmp(Employee emp) {
		return repo.save(emp); //saves the given entity
	}
	
	public List<Employee> getEmployees() {
		return repo.findAll();
	}

	
	public Employee getEmployee(int id) {
		return repo.findById(id). orElse(null);
	}

}
