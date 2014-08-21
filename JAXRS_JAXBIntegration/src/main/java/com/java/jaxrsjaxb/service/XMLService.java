package com.java.jaxrsjaxb.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.java.jaxrsjaxb.dto.Book;

@Path("/xml/book")
public class XMLService {
 
	@GET
	@Path("/{isbn}")
	@Produces(MediaType.APPLICATION_XML)
	public Book getCustomerInXML(@PathParam("isbn") String  isbn) {
 
		Book book = new Book();
		book.setName("SOA WEB SERVICES");
		book.setAuthor("SUDIPTA GHOSH");
		book.setPublisher("Pearson");
		book.setIsbn("122");
 
		return book;
 
	}
 
}