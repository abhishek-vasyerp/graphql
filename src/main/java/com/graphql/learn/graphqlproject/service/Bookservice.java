package com.graphql.learn.graphqlproject.service;

import java.util.List;

import com.graphql.learn.graphqlproject.entites.Book;

public interface Bookservice {
	
	//create
	Book create(Book Book);
	
	//get all
	List<Book> getAll();
	
	//get single book
	Book get(int bookid);

}
