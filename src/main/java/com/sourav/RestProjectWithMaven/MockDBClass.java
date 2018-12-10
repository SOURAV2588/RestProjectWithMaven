package com.sourav.RestProjectWithMaven;

import java.util.ArrayList;
import java.util.List;

public class MockDBClass {
	
	static List<DSEmployee> employeeList = new ArrayList<>();
	
	public static List<DSEmployee> getAllEmployees() {
		DSEmployee sourav = new DSEmployee("SOURAV","GHOSH","SGH4","IS REQUIREMENTS","DES");
		DSEmployee shuvam = new DSEmployee("SHUVAM","PARGAL","SPL7","LEX APPS","DES");
		employeeList.add(sourav);
		employeeList.add(shuvam);
		return employeeList;
	}
	
	public static DSEmployee getEmployee(String trigramId) {
		for(DSEmployee employee : getAllEmployees()) {
			if (employee.getTrigramId().equalsIgnoreCase(trigramId)) {
				return employee;
			}
		}
		return null;
	}
	
	public static void addEmployee(DSEmployee dsEmployee) {
		employeeList.add(dsEmployee);
	}
	
	public static DSEmployee findDSEmployee(String triagramId) {
		for(DSEmployee dsEmployee : getAllEmployees()) {
			if(dsEmployee.getTrigramId().equalsIgnoreCase(triagramId)) {
				return dsEmployee;
			}
		}
		return null;
	}
	
	public static void deleteDSEmployee(String triagramId) {
		DSEmployee toBeDeleted = new DSEmployee();
		for(DSEmployee dsEmployee : getAllEmployees()) {
			if(dsEmployee.getTrigramId().equalsIgnoreCase(triagramId)) {
				toBeDeleted = dsEmployee;
				break;
			}
		}
		employeeList.remove(toBeDeleted);
	}

}
