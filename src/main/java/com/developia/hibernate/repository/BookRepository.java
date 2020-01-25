package com.developia.hibernate.repository;

import com.developia.hibernate.entity.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {

}
