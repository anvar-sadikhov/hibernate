package com.developia.hibernate.controller;

import com.developia.hibernate.entity.Book;
import com.developia.hibernate.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/create")
    public void create(@ModelAttribute Book book) {
        bookService.create(book);

    }

    @GetMapping("/books")
    public String getBooks(Model model) {
        Iterable<Book> books = bookService.findAll();
        model.addAttribute("books", books);
        return "books";

    }


    @GetMapping("/view")
    public String view(Model model, @RequestParam Long id) {
        System.out.println("ID: " + id);
        try {
            Book book = bookService.findById(id);
            model.addAttribute("book", book);
            return "view";
        } catch (Exception ex) {
            return "not_found";
        }
    }

    @GetMapping("/update")
    public String updateBook(Book book) {
        try {
            bookService.update(book);
            return "update";
        } catch (Exception ex) {
            return "not_found";
        }
    }

    @GetMapping("/delete")
    public String deleteBook(Book book, @RequestParam Long id) {
        try {
            bookService.delete(id);
            return "delete";
        } catch (Exception ex) {
            return "not_found";
        }
    }

}
