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
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class DSEmployeeController {
	
	MockDBClass mockDBClass = new MockDBClass();
	
	@GET
	@Path("/{employeeTriagram}")
	public DSEmployee getEmployee(@PathParam("employeeTriagram") String trigramId) {
		return mockDBClass.getEmployee(trigramId);
	}

	@GET
	public List<DSEmployee> getAllEmployees() {
		return mockDBClass.getAllEmployees();
	}
	
	@POST
	public String addEmployee(DSEmployee dsEmployee) {
		mockDBClass.addEmployee(dsEmployee);
		return "POST WORKS";
	}
	
	@PUT
	@Path("/{employeeTriagram}")
	public DSEmployee updateEmployee(@PathParam("employeeTriagram") String trigramId, DSEmployee updatedDSEmployee) {
		return mockDBClass.updateEmployee(trigramId,updatedDSEmployee);
	}
	
	@DELETE
	@Path("/{employeeTriagram}")
	public void incompleteDeleteMethod(@PathParam("employeeTriagram") String trigramId) {
		mockDBClass.deleteDSEmployee(trigramId);
	}
}
