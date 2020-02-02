package com.developia.hibernate.controller;

import com.developia.hibernate.entity.Student;
import com.developia.hibernate.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(value = "/student")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/create")
    public void create(@ModelAttribute Student student) {
        studentService.create(student);
        System.out.println(student.getName());

    }

    @GetMapping("/students")
    public String getBooks(Model model) {
        Iterable<Student> students = studentService.findAll();
        model.addAttribute("students", students);
        return "books";

    }


    @GetMapping("/view")
    public String view(Model model, @RequestParam Long id) {
        System.out.println("ID: " + id);
        try {
            Student student = studentService.findById(id);
            model.addAttribute("student", student);
            return "view";
        } catch (Exception ex) {
            return "not_found";
        }
    }

    @GetMapping("/update")
    public String update(Student student) {
        try {
            studentService.update(student);
            return "update";
        } catch (Exception ex) {
            return "not_found";
        }
    }

    @GetMapping("/delete")
    public String deleteBook(Student student, @RequestParam Long id) {
        try {
            studentService.delete(id);
            return "delete";
        } catch (Exception ex) {
            return "not_found";
        }
    }

}
