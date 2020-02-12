package com.developia.hibernate.repository;

import com.developia.hibernate.entity.Book;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
    Book findByTitle(String title);

    Book findByAuthor(String author);

    Book findByTitleAndAuthor(String title, String author);

    @Query("select count (b) from Book b")
    long getCount();

}
