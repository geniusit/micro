package com.oxit.micro;

import java.util.Date;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Path("helloworld")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class OrdersResource {

	@GET
	public Response getHelloWorlds() {
		return Response.ok("helloworld").build();
	}

	@POST
	public Response addHelloWorld(HelloWorld newHelloWorld) {
		if (newHelloWorld != null) {
			newHelloWorld.setStartDate(new Date().toString());
		}
		return Response.status(Status.CREATED).build();
	}
}