package com.springbootwithmysql2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootwithmysql2.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
// <Employee, Integer> Employee -class name, Integer-datatype of int id