package com.graphql.learn.graphqlproject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.graphql.learn.graphqlproject.entites.Book;
import com.graphql.learn.graphqlproject.service.Bookservice;

//@RestController
//@RequestMapping("/book")
@Controller
public class BookController {

	@Autowired
	private Bookservice bookservice;

	// Create

	// @PostMapping
	@MutationMapping("createBook")
	public Book create(@Argument("book") Book Book) {

		return this.bookservice.create(Book);
	}

	// get all

//	@GetMapping
	@QueryMapping("allBooks")
	public List<Book> getAll() {
		return this.bookservice.getAll();

	}

	// get single book
	@QueryMapping("/{bookId}")
	public Book get(@Argument int bookID) {
		return this.bookservice.get(bookID);

	}

}