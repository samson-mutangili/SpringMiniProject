package com.samson.springboot.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samson.springboot.dao.BookRepository;
import com.samson.springboot.models.Book;

@Service
public class BookService {
	
	
	@Autowired
	private BookRepository bookRepository;
	
	public Collection<Book> getAllBooks(){
		
		List<Book> books = new ArrayList<Book>();
		
		for(Book book : bookRepository.findAll()){
			books.add(book);
		}
		
		return books;
	}
	
	public void delete(long id) {
		bookRepository.deleteById(id);
	}

}
