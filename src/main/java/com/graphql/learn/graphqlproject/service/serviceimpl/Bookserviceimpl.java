package com.graphql.learn.graphqlproject.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graphql.learn.graphqlproject.entites.Book;
import com.graphql.learn.graphqlproject.repository.Bookrep;
import com.graphql.learn.graphqlproject.service.Bookservice;



@Service
public class Bookserviceimpl implements Bookservice {

	@Autowired
	private Bookrep bookRep;

	@Override
	public Book create(Book book) {
		return this.bookRep.save(book);
	}

	@Override
	public List<Book> getAll() {
		// TODO Auto-generated method stub
		return this.bookRep.findAll();
	}

	@Override
	public Book get(int bookid) {
		// TODO Auto-generated method stub
		return this.bookRep.findById(bookid).orElseThrow(()->new RuntimeException("book not found"));
	}

	
	
	
	
	

}
