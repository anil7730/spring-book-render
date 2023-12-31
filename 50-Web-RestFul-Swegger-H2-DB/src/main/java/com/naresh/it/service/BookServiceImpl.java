package com.naresh.it.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.naresh.it.entity.Book;
import com.naresh.it.repository.BookRepository;


@Service
public class BookServiceImpl implements BookService
{
	private BookRepository repository;
	
	public BookServiceImpl(BookRepository repository) {
		this.repository=repository;
	}
	
	@Override
	public String upsertBook(Book book) 
	{
		Integer id=book.getBookId();
		repository.save(book);
		if(id==null)
		{
		return "Record Inserted";
		}else {
			return "Record Updated";
		}
	}
	@Override
	public List<Book> getAllBooks(){
		return repository.findAll();
	}
	@Override
	public String deleteBook(Integer bookId)
	{
		repository.deleteById(bookId);
		return "Record Deleted";
				
	}
}

