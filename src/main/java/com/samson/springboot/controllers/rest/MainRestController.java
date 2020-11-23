package com.samson.springboot.controllers.rest;

import java.util.Collection;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.samson.springboot.models.Book;
import com.samson.springboot.services.BookService;

@RestController
public class MainRestController {
	
	@Autowired
	private BookService bookService;
	
	
	@GetMapping("/findAllBooks")
	public Collection<Book> getAllBooks(){
		return bookService.getAllBooks();
	}
	
//	@GetMapping("/delete")
//	public void delete(@RequestParam long id) {
//		bookService.delete(id);
//	}
	
	@RequestMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		bookService.delete(id);
	}
	
	
}
