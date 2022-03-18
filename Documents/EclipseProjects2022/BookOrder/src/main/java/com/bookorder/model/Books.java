/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bookorder.model;

/**
 *
 * @author Muzamiru.Mbaziira
 */
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.beans.factory.annotation.Qualifier;

//mark class as an Entity 

@Entity
//defining class name as Table name
@Table
public class Books {
//Defining book id as primary key

    @Id
    @Column
    @GeneratedValue (strategy = GenerationType.IDENTITY)
   // @Qualifier
    private int isbn;
    
    @Column
   
    private int quantity;

   
    @Column
    private String title;
    @Column
    private String year;
    @Column
    private double price;
    
    @Column
    private String author;

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
}
    
    
