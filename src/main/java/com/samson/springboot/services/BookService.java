package com.samson.springboot.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samson.springboot.dao.BookRepository;
import com.samson.springboot.models.Book;

@Service
public class BookService {
	
	@Autowired
	public BookRepository bookRepository;

	public Collection<Book> getAllBooks() {
		
		List<Book> books = new ArrayList<Book>();
		for(Book book:bookRepository.findAll()) {
			books.add(book);
		}
		return books;
	}

	public void delete(int id) {
		bookRepository.deleteById(id);
		
	}

	public Optional<Book> getBook(int id) {
			return bookRepository.findById(id);	
		
	}

	public void saveBook(Book book) {
		bookRepository.save(book);
		
	}

	public void addBook(Book book) {
		bookRepository.save(book);
		
	}

	public void deleteBook(int id) {
		bookRepository.deleteById(id);
		
	}

}
