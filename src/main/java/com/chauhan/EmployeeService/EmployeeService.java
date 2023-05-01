package com.chauhan.EmployeeService;



	
	

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

import com.chauhan.EmployeeModel.Employee;
import com.chauhan.EmployeeRepository.EmployeeRepo;

	@Service
	public class EmployeeService {
		
		@Autowired
		EmployeeRepo empRepo;

		
		public List<Employee> addEmployee(List<Employee> employee) {
			
			List<Employee> emp=empRepo.saveAll(employee);
			
			return  emp;
		}

	}

	