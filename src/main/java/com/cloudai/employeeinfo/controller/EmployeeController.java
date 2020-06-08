package com.cloudai.employeeinfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cloudai.employeeinfo.model.Employee;
import com.cloudai.employeeinfo.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = "employee_form", method = RequestMethod.GET)
	public String getEmployeeForm() {
		return "addEmployee";
	}
	@RequestMapping(value = "employee_edit", method = RequestMethod.GET)
	public String getEmployeeEditForm(@RequestParam int id ,  Model model) {
		model.addAttribute("emp", employeeService.getEmployeeById(id));
		return "editEmployee";
	
	}
	

	@RequestMapping(value = "save_employee", method = RequestMethod.POST)
	public String saveEmployeeInfo(@ModelAttribute Employee employee) {
		employeeService.saveEmployeeInfo(employee);
		return "redirect:/employee_list";
	}
		
	@RequestMapping(value = "update_employee", method = RequestMethod.POST)
	public String updateEmployeeInfo(@ModelAttribute Employee employee) {
			employeeService.updateEmployeeInfo(employee);
			return "redirect:/employee_list";
	}
	
	

	@RequestMapping(value = "employee_list", method = RequestMethod.GET)
	public String getEmployeeList(Model model) {
		model.addAttribute("employees", employeeService.getAllEmployee());
		return "listEmployee";
	}
	@RequestMapping(value ="employee_delete", method=RequestMethod.GET)
	public String deletEmployeeInfo(@RequestParam int id) {
		employeeService.deleteEmployeeInfo(id);
		return "redirect:/employee_list";
	}

}