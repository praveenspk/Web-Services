package com.spk.Simple_RestExample;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/user")
public class UserResource {

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<User> getUser() {
		System.out.println("Alien called");
		List<User> list = new ArrayList<>();
		list.add(new User("Praveen", 9411, 9490137902L));
		list.add(new User("Vardhan", 9845, 9491067978L));

		return list;

	}

	@POST
	@Produces(MediaType.APPLICATION_XML)
	public User createUser(User user) {

		System.out.println("User created : " + user);
		return user;

	}

}
