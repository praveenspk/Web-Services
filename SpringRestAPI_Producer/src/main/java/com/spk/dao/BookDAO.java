package com.spk.dao;

import java.util.List;

import com.spk.model.Book;

public interface BookDAO {

	/*
	 * public List<Book> getBooks();
	 * 
	 * public void saveBook(Book book);
	 * 
	 * public Book getBook(int theId);
	 * 
	 * public void deleteBook(int theId);
	 */

	public List<Book> getBooks();

	public Book getBookById(Long id);

	public void deleteBookById(int theId);

	public void createBook(Book book);

	public int updateBook(Book book);

	/** removes all podcasts */
	public void deleteBook();

}
