/*
 EmployeeHelper Class
 CopyRight 2017
*/

package com.mkyong.rest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeHelper {

	static Map <Integer , Employee> employeeList = new HashMap<Integer ,Employee>();
	
	public static Employee getEmployeeById(String iD) {
		int id = Integer.parseInt(iD);
		Employee e = employeeList.get(id);
		if(e == null){
			e = new Employee();
			e.setId(0);
			e.setFirstName("Dummy");
			e.setLastName("Dummy");
			e.setAge(100);
			e.setCity("Dummy");
			e.setCompany("Dummy");
		   
		}
		return e;
	}
	
	public static String addEmployee(Employee e){
		employeeList.put(e.getId() , e);
		String msg = "Employee with id: "+e.getId()+" added successfully";
		return msg;
	}

}
