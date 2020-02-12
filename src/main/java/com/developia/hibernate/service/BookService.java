package com.developia.hibernate.service;

import com.developia.hibernate.entity.Book;

public interface BookService {

    Book findById(Long id);

    Book findByTitle (String title);

    Iterable<Book> findAll();

    void create(Book book);

    void update(Book book);

    void save(Book book);

    void delete(Long id);

}
