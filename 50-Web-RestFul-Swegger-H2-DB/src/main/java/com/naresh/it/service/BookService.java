package com.naresh.it.service;

import java.util.List;

import com.naresh.it.entity.Book;

public interface BookService 
{
	public String upsertBook(Book book);
	
	public List<Book> getAllBooks();
	public String deleteBook(Integer bookId); 
}

