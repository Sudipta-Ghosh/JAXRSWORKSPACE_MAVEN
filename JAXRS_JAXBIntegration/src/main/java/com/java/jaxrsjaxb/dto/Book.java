package com.java.jaxrsjaxb.dto;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
@XmlRootElement
@XmlAccessorType
@XmlType(name="",propOrder={
		"author",
		"name",		
		"publisher",
		"isbn"
})
public class Book {
	
   @XmlElement(namespace="http://www.bookstore.com/name",required=true)	
   private String name;
   @XmlElement(namespace="http://www.bookstore.com/author",required=true)
   private String author;
   @XmlElement(namespace="http://www.bookstore.com/publisher")
   private String publisher;
   @XmlElement(namespace="http://www.bookstore.com/isbn",required=true)
   private String isbn;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getPublisher() {
	return publisher;
}
public void setPublisher(String publisher) {
	this.publisher = publisher;
}
public String getIsbn() {
	return isbn;
}
public void setIsbn(String isbn) {
	this.isbn = isbn;
}
   
}
