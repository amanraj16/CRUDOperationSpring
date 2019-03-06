package com.capgemini;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.beans.Employee;
import com.capgemini.service.EmployeeService;

@RestController
public class EmployeeController {
	
		@Autowired
		EmployeeService employeeService;
		
		@RequestMapping(value="employee",method=RequestMethod.GET)
		public List<Employee> getEmployees()
		{
			return employeeService.getEmployees();
		}
		@RequestMapping(value="employeeList/{id}",method=RequestMethod.GET)
		public Employee getEmployee(@PathVariable String id)
		{
			Employee employee=employeeService.findOne(id);
			return employee;
		}
		@RequestMapping(value="employeeAdd/{id}/{designation}/{name}/{salary}",method=RequestMethod.GET)
		public Employee addEmployee(@PathVariable String id,@PathVariable String designation,@PathVariable String name,@PathVariable double salary)
		{
			Employee employee=new Employee(id,designation,name,salary);
			return employeeService.save(employee);
		}
		@RequestMapping(value="employeeDelete/{id}",method=RequestMethod.GET)
		public boolean deleteEmployee(@PathVariable String id)
		{
				return employeeService.deleteEmployee(id);
		}
		@RequestMapping(value="employeeUpdate/{id}/{designation}/{name}/{salary}",method=RequestMethod.GET)
		public Employee updateEmployee(@PathVariable String id,@PathVariable String designation,@PathVariable String name,@PathVariable double salary)
		{
			employeeService.deleteEmployee(id);
			Employee employeeNew=new Employee(id,designation,name,salary);
			return employeeService.save(employeeNew);
		}
}
