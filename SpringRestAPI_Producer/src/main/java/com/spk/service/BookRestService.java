package com.spk.service;

import java.io.IOException;
import java.util.List;

import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import com.spk.dao.BookDAO;
import com.spk.model.Book;

@Component
@Path("/book")
public class BookRestService {

	@Autowired
	private BookDAO dao;

	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.TEXT_HTML })
	@Transactional
	public Response createPodcast(Book book) {
		dao.createBook(book);

		return Response.status(201).entity("A new podcast/resource has been created").build();
	}

	@POST
	@Path("list")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Transactional
	public Response createPodcasts(List<Book> book) {
		for (Book books : book) {
			dao.createBook(books);
		}

		return Response.status(204).build();
	}

	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public List<Book> getPodcasts() throws JsonGenerationException, JsonMappingException, IOException {
		List<Book> books = dao.getBooks();
		return books;
	}

}
