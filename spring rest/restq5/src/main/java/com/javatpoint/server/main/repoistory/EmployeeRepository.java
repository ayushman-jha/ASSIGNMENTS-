package com.javatpoint.server.main.repoistory;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.javatpoint.server.main.model.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {
	public Employee findByEmployeeName(String name);

	public List<Employee> findByEmployeeDepartment(String department);

	public List<Employee> findByEmployeeDesignation(String destignation);

	public List<Employee> findByEmployeeSalary(long salary);

}
