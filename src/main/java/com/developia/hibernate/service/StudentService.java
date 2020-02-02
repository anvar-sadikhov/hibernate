package com.developia.hibernate.service;

import com.developia.hibernate.entity.Book;
import com.developia.hibernate.entity.Student;

import java.util.List;

public interface StudentService {
    void save(Student student);

    Iterable<Student> findAll();

    Student findById(Long id);

    Student findByName(String name);

    Student findByNameAndSurname(String name, String surname);

    List<Student> findByAge(Integer age);

    List<Student> findByAges(Integer minAge, Integer maxAge);

    void create(Student student);

    void update(Student student);

    void delete(Long id);

    long getCount();
}
