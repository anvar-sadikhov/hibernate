package com.developia.hibernate.controller;

import com.developia.hibernate.entity.Student;
import com.developia.hibernate.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/student")
public class StudentRestController {
    private final StudentService studentService;

    public StudentRestController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/save")
    public void saveStudent(@RequestBody Student student) {
        studentService.save(student);
        System.out.println(student.getName());
    }

    @GetMapping("/find/{id}")
    public Student find(@PathVariable Long id) {
        Student student = studentService.findById(id);
        return student;
    }

    @GetMapping("/find/{name}")
    public Student findByName(@PathVariable String name) {
        Student student = studentService.findByName(name);
        return student;
    }

    @GetMapping("/find/fullname/{name}/{surname}")
    public Student findFullName(@PathVariable String name, @PathVariable String surname) {
        return studentService.findByNameAndSurname(name, surname);

    }


    @GetMapping("/find/ages/{age}")
    public List<Student> findByAge(@PathVariable Integer age) {
        return studentService.findByAge(age);

    }

    @GetMapping("/find/ages/{minAge}/{maxAge}")
    public List<Student> findByAges(@PathVariable Integer minAge, @PathVariable Integer maxAge) {
        return studentService.findByAges(minAge, maxAge);
    }

    @GetMapping("/find/all")
    public Iterable<Student> findAll() {

        Iterable<Student> students = studentService.findAll();
        return students;
    }

    @GetMapping("/count")
    public long getCount() {
        return studentService.getCount();

    }
}
