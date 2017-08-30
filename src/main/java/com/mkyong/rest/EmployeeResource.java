/*
EmployeeResource Class
Copyright 2017
*/

package com.mkyong.rest;
 
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
 
@Path("/emp")
public class EmployeeResource {
 
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_XML)
	public Response getEmployee(@PathParam("id") String id) {
 
		Employee emp = EmployeeHelper.getEmployeeById(id);
 
		return Response.status(200).entity(emp).build();
 
	}
	
	@GET
	@Path("/hello/{param}")
	public Response getMsg(@PathParam("param") String msg) {

		String output = "Jersey say : " + msg;

		return Response.status(200).entity(output).build();

	}
	
	@POST
	@Produces(MediaType.APPLICATION_XML)
	public Response getMsg(Employee emp) {
 
		String response = EmployeeHelper.addEmployee(emp);
		Status status = new Status();
		status.setMessage(response);
        String msg = "{\"msg\":"+response+"}";
		return Response.status(201).entity(status).build();
 
	}
	
	
 
}
