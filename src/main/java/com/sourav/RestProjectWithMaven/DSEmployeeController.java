package com.sourav.RestProjectWithMaven;

import java.util.ArrayList;
import java.util.List;

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
	@Produces(MediaType.APPLICATION_XML)
	public DSEmployee getEmployee(@PathParam("employeeTriagram") String trigramId) {
		return MockDBClass.getEmployee(trigramId);
	}

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<DSEmployee> getAllEmployees() {
		return MockDBClass.getAllEmployees();
	}
	
	@POST
	public void incompletePostMethod() {}
	
	@PUT
	public void incompletePutMethod() {}
	
	@DELETE
	public void incompleteDeleteMethod() {}
}
