package com.Basic_java_class_17;

import java.util.ArrayList;
import java.util.List;

public class EmployeeImpl implements EmployeeInterface{

	List<Employee> List=new ArrayList<Employee>();
	static {
	 
		Employee employee=new Employee();
		employee.setId(1);
		employee.setName("Ram");
		employee.setGender("Male");
		employee.setAddress("Basundhara");
		employee.setPhoneNo("9876356789");
		empList.add(employee);
	}
	
	
	@Override
	public void addEmployee(Employee employee) {
		empList.add(employee);
		
	}

	@Override
	public String deleteEmployee(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
