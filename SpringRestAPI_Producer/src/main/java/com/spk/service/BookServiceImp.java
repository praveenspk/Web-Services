package com.spk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spk.dao.BookDAO;
import com.spk.model.Book;

@Service
public class BookServiceImp implements BookkService {

	@Override
	public List<Book> getBooks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveBook(Book book) {
		// TODO Auto-generated method stub

	}

	@Override
	public Book getCustomer(int theId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteBook(int theId) {
		// TODO Auto-generated method stub

	}

}
