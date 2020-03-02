package com.developia.hibernate.service.impl;

import com.developia.hibernate.entity.Book;
import com.developia.hibernate.exceptions.SignException;
import com.developia.hibernate.repository.BookRepository;
import com.developia.hibernate.service.BookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    @Override
    public Book findById(Long id) {
        try {
            return bookRepository.findById(id).get();
        }catch (Exception ex){
            throw new SignException("Not Signed");
        }

    }

    @Override
    public Book findByTitle(String title) {
        return bookRepository.findByTitle(title);
    }

    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();

    }

    @Override
    public void create(Book book) {
        bookRepository.save(book);

    }


    @Override
    public void update(Book book) {
        Book oldBook = bookRepository.findById(book.getId()).get();
        oldBook.setAuthor(book.getAuthor());
        oldBook.setTitle(book.getTitle());
        bookRepository.save(oldBook);


    }

    @Override
    public void save(Book book) {
        bookRepository.save(book);
    }

    @Override
    public void delete(Long id) {
        Book book = bookRepository.findById(id).get();
        bookRepository.delete(book);
    }
}
