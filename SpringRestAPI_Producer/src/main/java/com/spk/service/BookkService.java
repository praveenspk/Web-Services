package com.spk.service;

import java.util.List;

import com.spk.model.Book;

public interface BookkService {

	public List<Book> getBooks();

	public void saveBook(Book book);

	public Book getCustomer(int theId);

	public void deleteBook(int theId);

}
