package com.example.n1.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.n1.entities.Author;
import com.example.n1.entities.AuthorDataService;
import com.example.n1.entities.Book;
import com.example.n1.entities.BookDataService;

@RestController
public class TestController {

    private AuthorDataService authorDataService;
    private BookDataService bookDataService;

    public TestController(AuthorDataService authorDataService, BookDataService bookDataService) {
        this.authorDataService = authorDataService;
        this.bookDataService = bookDataService;
    }

    @GetMapping("check")
    public List<Author> checkApi() {
        List<Author> authors = authorDataService.findAll();

        // for (Author author : authors) {
        // System.out.println(author.getFirstName());
        // }

        return authors;
    }

    @GetMapping("checkBook")
    public List<Book> checkBook() {
        List<Book> books = bookDataService.findAll();

        // for (Author author : authors) {
        // System.out.println(author.getFirstName());
        // }

        return books;
    }
}
