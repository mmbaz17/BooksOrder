/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bookorder.controller;

/**
 *
 * @author Muzamiru.Mbaziira
 */
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.bookorder.model.Books;
import com.bookorder.service.BooksService;

//import org.springframework.web.bind.annotation.RequestMapping;


@RestController
//@RequestMapping("/book")
public class BooksController 
{
//autowire the BooksService class
@Autowired
BooksService booksService;
//creating a get mapping that retrieves all the books detail from the database 
@GetMapping("/book")
private List<Books> getAllBooks() 
{
return booksService.getAllBooks();
}
//creating a get mapping that retrieves the detail of a specific book
@GetMapping("/book/{isbn}")
private Books getBooks(@PathVariable("isbn") int bookid) 
{
return booksService.getBooksById(bookid);
}
//creating a delete mapping that deletes a specified book
@DeleteMapping("/book/{isbn}")
private void deleteBook(@PathVariable("isbn") int bookid) 
{
booksService.delete(bookid);
}
//creating post mapping that post the book detail in the database
@PostMapping("/books")
private int saveBook(@RequestBody Books books) 
{
booksService.saveOrUpdate(books);
return books.getIsbn();
}
//creating put mapping that updates the book detail 
@PutMapping("/books")
private Books update(@RequestBody Books books) 
{
booksService.saveOrUpdate(books);
return books;
}
}
