package com.developia.hibernate.repository;

import com.developia.hibernate.entity.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Long> {
    Student findByName(String name);

    Student findByNameAndSurname(String name, String surname);

    @Query("select count (s) from students s")
    long getCount();

    @Query("select s from students s where s.age = :age")
    List<Student> findByAge(@Param("age") Integer age);

    @Query("select s from students s where s.age >= :minAge and s.age <= :maxAge")
    List<Student> findByAges(@Param("minAge") Integer minAge, @Param("maxAge") Integer maxAge);
}
