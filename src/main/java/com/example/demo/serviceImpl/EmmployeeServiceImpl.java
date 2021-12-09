package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmpoyeeRepository;
import com.example.demo.service.EmployeeService;


@Service
public class EmmployeeServiceImpl implements EmployeeService {
	
	private EmpoyeeRepository employeeRepository;
	

	public EmmployeeServiceImpl(EmpoyeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}


	@Override
	public Employee saveEmployee(Employee employee) {
		
		return employeeRepository.save(employee);
	}


	@Override
	public List<Employee> getAllEmployees() {
		
		return employeeRepository.findAll();
	}

}
