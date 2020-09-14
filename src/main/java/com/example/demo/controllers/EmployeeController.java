package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Employee;
import com.example.demo.services.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@PostMapping(value = "/employee")
	public String addEmployeeDetails(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);
		return "Successfully added";
	}

	@GetMapping(value = "/employees")
	public List<Employee> getEmployeeDetails() {
		return employeeService.getEmployee();
	}

	@PutMapping(value = "/employee")
	public String updateEmployeeDetails(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);
		return "updated successfully";
	}

	@DeleteMapping(value = "/employee/{id}")
	public String deleteEmployeeDetails(@PathVariable Long id) {
		employeeService.deleteEmployee(id);
		return "Deleted Successfully";
	}

}
