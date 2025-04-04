package com.bookstore.dao;

import java.util.List;

import com.bookstore.entity.Book;
import org.springframework.stereotype.Component;

@Component
public interface IBookStoreDAO {
	
	List<Book> getBooks();
	Book getBook(int bookId);
	Book createBook(Book book);
	Book updateBook(int bookId,Book book);
	boolean deleteBook(int bookId);

}
