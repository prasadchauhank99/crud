package com.chauhan.EmployeeController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.chauhan.EmployeeModel.Employee;
import com.chauhan.EmployeeService.EmployeeService;

@RestController
public class EmployeeController
{
	
	@Autowired
	EmployeeService empService;
	
	@PostMapping("/addEmp")
	public List<Employee> addEmployee(@RequestBody List<Employee> employee)
	{
		List<Employee> emp= empService.addEmployee(employee);
		return emp;
		
	}

	
}

