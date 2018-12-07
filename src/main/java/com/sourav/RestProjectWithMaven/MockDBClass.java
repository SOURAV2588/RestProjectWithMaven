package com.sourav.RestProjectWithMaven;

import java.util.ArrayList;
import java.util.List;

public class MockDBClass {
	
	public static List<DSEmployee> getAllEmployees() {
		List<DSEmployee> employeeList = new ArrayList<>();
		DSEmployee sourav = new DSEmployee("SOURAV","GHOSH","SGH4","IS REQUIREMENTS","DES");
		employeeList.add(sourav);
		return employeeList;
	}
	
	public static DSEmployee getEmployee(String trigramId) {
		for(DSEmployee employee : getAllEmployees()) {
			if (employee.getTrigramId().equals(trigramId)) {
				return employee;
			}
		}
		return null;
	}
	
	public static DSEmployee getSourav() {
		DSEmployee sourav = new DSEmployee("SOURAV","GHOSH","SGH4","IS REQUIREMENTS","DES");
		return sourav;
	}

}
