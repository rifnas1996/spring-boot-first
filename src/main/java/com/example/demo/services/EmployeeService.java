package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Employee;

public interface EmployeeService {
	public void addEmployee(Employee employee);

	public List<Employee> getEmployee();

	public void deleteEmployee(Long id);

}
