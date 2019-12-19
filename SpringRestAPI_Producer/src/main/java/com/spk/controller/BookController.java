package com.spk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spk.dao.BookDAO;
import com.spk.model.Book;

public class BookController {

	@Autowired
	private BookDAO dao;

	public String saveBook(@ModelAttribute("book") Book book) {

		return null;

	}

}
