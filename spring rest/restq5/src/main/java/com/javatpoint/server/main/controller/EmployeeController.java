package com.javatpoint.server.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.server.main.model.Employee;
import com.javatpoint.server.main.service.EmployeeService;


@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/create")
	public String create(@RequestParam String employeeName, @RequestParam String employeeDepartment,
			@RequestParam String employeeDesignation, @RequestParam long employeeSalary) {
		Employee employee = employeeService.createEmployee(employeeName, employeeDepartment, employeeDesignation,
				employeeSalary);
		return employee.toString();
	}

	@GetMapping("/getAll")
	public List<Employee> getAll() {
		return employeeService.getAll();
	}

	@GetMapping("/getbyName")
	public Employee getbyName(@RequestParam String employeeName) {
		return employeeService.getbyName(employeeName);
	}

	@GetMapping("/getbyDepartment")
	public List<Employee> getbyDepartment(@RequestParam String employeeDepartment) {
		return employeeService.getbyDepartment(employeeDepartment);
	}

	@GetMapping("/getbyDesignation")

	public List<Employee> getbyDesignation(@RequestParam String employeeDesignation) {
		return employeeService.getbyDesignation(employeeDesignation);
	}

	@GetMapping("/getbySalary")
	public List<Employee> getbySalary(@RequestParam long employeeSalary) {
		return employeeService.getbySalary(employeeSalary);
	}

	@PutMapping("/update")
	public String update(@RequestParam String employeeName, @RequestParam String employeeDepartment,
			@RequestParam String employeeDesignation, @RequestParam long employeeSalary) {
		Employee employee = employeeService.update(employeeName, employeeDepartment, employeeDesignation,
				employeeSalary);
		return employee.toString();
	}

	@DeleteMapping("/deleteAll")
	public void deleteAll() {
		employeeService.deleteAll();
	}

	@DeleteMapping("/deleteByName")
	public void deleteByName(@RequestParam String employeeName) {
		employeeService.deleteByName(employeeName);
	}

}
