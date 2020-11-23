package com.samson.springboot.dao;
import com.samson.springboot.models.*;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {


	

	
}
