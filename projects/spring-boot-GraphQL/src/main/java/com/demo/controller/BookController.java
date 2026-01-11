package com.demo.controller;

import com.demo.model.Book;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BookController {

    private final List<Book> books = new ArrayList<>();

    public BookController() {
        books.add(new Book(1L, "Clean Code", "Robert C. Martin"));
        books.add(new Book(2L, "Effective Java", "Joshua Bloch"));
    }

    @QueryMapping
    public List<Book> books() {
        return books;
    }

    @QueryMapping
    public Book bookById(@Argument Long id) {
        return books.stream()
                .filter(b -> b.id().equals(id))
                .findFirst()
                .orElse(null);
    }

    @MutationMapping
    public Book addBook(@Argument String title, @Argument String author) {
        Book book = new Book((long) (books.size() + 1), title, author);
        books.add(book);
        return book;
    }
}