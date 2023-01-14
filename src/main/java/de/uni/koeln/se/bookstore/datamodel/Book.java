package de.uni.koeln.se.bookstore.datamodel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistance.GenerationType;

@Entity
public class Book {

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Integer id;
	
	private String name;
	private String author;
	private Integer publishYear;
	
	private Integer price;
	
	public Book() {
		
	}
	
	public Book(String name, String author, Integer publishYear) {
		this.name = name;
		this.author = author;
		this.publishYear = publishYear;
	}
	
	public Book(String name, String author, Integer publishYear, Integer price) {
		this.name = name;
		this.author = author;
		this.publishYear = publishYear;
		this.price = price;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getPrice() {
		return price;
	}
	
	public void setPrice(Integer price) {
		this.price = price;
	}

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

	public Integer getPublishYear() {
		return publishYear;
	}

	public void setYear(Integer year) {
		this.publishYear = year;
	}
}
