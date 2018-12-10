package com.sourav.RestProjectWithMaven;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/employees")
public class DSEmployeeController {
	
	@GET
	@Path("/{employeeTriagram}")
	@Produces(MediaType.APPLICATION_JSON)
	public DSEmployee getEmployee(@PathParam("employeeTriagram") String trigramId) {
		return MockDBClass.getEmployee(trigramId);
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<DSEmployee> getAllEmployees() {
		return MockDBClass.getAllEmployees();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public void addEmployee(DSEmployee dsEmployee) {
		MockDBClass.addEmployee(dsEmployee);
	}
	
	@PUT
	@Path("/{employeeTriagram}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public DSEmployee updateEmployee(@PathParam("employeeTriagram") String trigramId, DSEmployee updatedDSEmployee) {
		DSEmployee oldDSEmployee = MockDBClass.findDSEmployee(trigramId);
		oldDSEmployee.setFirstName(updatedDSEmployee.getFirstName());
		oldDSEmployee.setLastName(updatedDSEmployee.getLastName());
		oldDSEmployee.setTeamName(updatedDSEmployee.getTeamName());
		oldDSEmployee.setBrand(updatedDSEmployee.getBrand());
		return oldDSEmployee;
	}
	
	@DELETE
	@Path("/{employeeTriagram}")
	@Consumes(MediaType.APPLICATION_JSON)
	public void incompleteDeleteMethod(@PathParam("employeeTriagram") String trigramId) {
		MockDBClass.deleteDSEmployee(trigramId);
	}
}
