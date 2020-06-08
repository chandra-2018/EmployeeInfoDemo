package com.cloudai.employeeinfo.service;

import java.util.List;

import org.springframework.web.bind.annotation.ModelAttribute;

import com.cloudai.employeeinfo.model.Employee;

public interface EmployeeService {
void saveEmployeeInfo(Employee employee );

void updateEmployeeInfo(Employee employee );

void deleteEmployeeInfo(int id );

List<Employee>getAllEmployee ();
Employee getEmployeeById(int id);
}
