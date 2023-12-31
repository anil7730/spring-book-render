package com.naresh.it.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.naresh.it.entity.Book;

public interface BookRepository extends JpaRepository<Book, Serializable> 
{
	
}
