package com.srj.mvc.model;

import java.util.Arrays;
import java.util.List;

public class EmployeeService {
	public List<Employee> getEmployee(){
		return Arrays.asList(
				new Employee(101, "Suraj", "Mane"),
				new Employee(102, "Tony", "Stark"),
				new Employee(103, "Thor", "Shinde"));
	}
}
