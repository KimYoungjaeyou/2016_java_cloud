package com.skcc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skcc.domain.book.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{
	
	List<Book> findByUserId(String user_id);
}
