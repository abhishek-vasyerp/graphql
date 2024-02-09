package com.graphql.learn.graphqlproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.graphql.learn.graphqlproject.entites.Book;

public interface Bookrep extends JpaRepository<Book, Integer> {
	
}
