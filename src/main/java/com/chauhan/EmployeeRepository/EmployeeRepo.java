package com.chauhan.EmployeeRepository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.chauhan.EmployeeModel.Employee;



@Repository
public interface EmployeeRepo {
	List<Employee> saveAll(List<Employee> employee);
}
