package com.developia.hibernate.controller;

import com.developia.hibernate.entity.Book;
import com.developia.hibernate.service.BookService;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookRestController {
    private final BookService bookService;

    public BookRestController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/save")
    public void saveBook(@RequestBody Book book){
        bookService.save(book);
        System.out.println(book.getTitle());
    }

    @GetMapping("/find/{id}")
    public Book find(@PathVariable Long id){
        Book book = bookService.findById(id);
        return book;
    }

    @GetMapping("/find/all")
    public Iterable<Book> findAll(){
        Iterable<Book> books = bookService.findAll();
        return books;
    }

    @GetMapping("/find/title/{title}")
    public Book findById(@PathVariable String title){
        Book book = bookService.findByTitle(title);
        return book;
    }
}
