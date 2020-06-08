package com.cloudai.employeeinfo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cloudai.employeeinfo.model.Employee;
import com.cloudai.employeeinfo.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	public EmployeeRepository employeeRepository;

	@Override
	public void saveEmployeeInfo(Employee employee) {
		employeeRepository.saveEmployeeInfo(employee);
	}

	@Override
	public void updateEmployeeInfo(Employee employee) {
     employeeRepository.updateEmployeeInfo(employee);		
	}

	@Override
	public void deleteEmployeeInfo(int id) {
		employeeRepository.deleteEmployeeInfo(id);
		
	}

	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepository.getAllEmployee();
	}

	@Override
	public Employee getEmployeeById(int id) {
		return employeeRepository.getEmployeeById(id);
	}

}
