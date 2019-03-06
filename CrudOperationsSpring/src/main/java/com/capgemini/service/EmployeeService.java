package com.capgemini.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capgemini.beans.Employee;

import java.util.LinkedList;
@Service
public class EmployeeService {
	static List<Employee> employeeList=new LinkedList<>(); 
	static
	{
		employeeList.add(new Employee("1001","HR","Aman",25000));
		employeeList.add(new Employee("1002","Developer","Raj",20000));
		employeeList.add(new Employee("1003","CEO","Dhyani",250000));
	}
	public Employee findOne(String id)
	{
		for(Employee employee:employeeList)
		{
			if(employee.getId().equals(id))
			{
				return employee;
			}
		}
		return null;
	}
	public Employee save(Employee employee)
	{
		employeeList.add(employee);
		return findOne(employee.getId());
	}
	public List<Employee> getEmployees()
	{
		return employeeList;
	}
	public boolean deleteEmployee(String id)
	{
		Employee employee=findOne(id);
		return employeeList.remove(employee);
	}
}
