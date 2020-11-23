package com.samson.springboot.controllers;

import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.samson.springboot.models.Book;
import com.samson.springboot.services.BookService;


@Controller
public class MainController {
	
	@Autowired
	public BookService bookService;
	
	@GetMapping("/")
	public String init(HttpServletRequest req) {
		
		req.setAttribute("books", bookService.getAllBooks());
		
		return "index";
	}
	
	@GetMapping("/books/edit")
	public String editBook(HttpServletRequest req, @RequestParam int bookId) {
		
		req.setAttribute("book", bookService.getBook(bookId).get());
		
		return "editBook";
	}
	
//	@InitBinder
//	public void initBinder(WebDataBinder binder) {
//		binder.registerCustomEditor(Date.class, new CusttomDateEditer(new simpleDateFormat("yyyy-mm-dd"), false));
//	}
	
	@PostMapping("/update/book")
	public void save(HttpServletRequest req, HttpServletResponse res, @ModelAttribute Book book) throws ServletException, IOException {		
		//save the book
		bookService.saveBook(book);
		req.setAttribute("books", bookService.getAllBooks());	
//		
		res.sendRedirect("/");
		
	}
	
	//url for new form
	@GetMapping("/addBook")
	public String add() {
		return "addNewBook";
	}
	
	@PostMapping("/add/book")
	public void addBook(HttpServletRequest req, HttpServletResponse res, @ModelAttribute Book book) throws ServletException, IOException {		
		//save the book
		bookService.addBook(book);
		req.setAttribute("books", bookService.getAllBooks());	
		req.setAttribute("added_book", "You have successfully added a new book");
		res.sendRedirect("/");		
	}
	
	@RequestMapping("/books/delete/{id}")
	public void deleteBook(@PathVariable int id, HttpServletRequest req, HttpServletResponse res) throws IOException {
		bookService.deleteBook(id);
		res.sendRedirect("/");
		
	}
	

}
