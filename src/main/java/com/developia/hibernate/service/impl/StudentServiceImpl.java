package com.developia.hibernate.service.impl;

import com.developia.hibernate.entity.Student;
import com.developia.hibernate.exceptions.SignException;
import com.developia.hibernate.repository.StudentRepository;
import com.developia.hibernate.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Iterable<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public void save(Student student) {
        studentRepository.save(student);

    }

    @Override
    public Student findById(Long id) {
        try {
            return studentRepository.findById(id).get();
        }catch (Exception ex){
            throw new SignException("Not Signed");
        }

    }

    @Override
    public Student findByName(String name) {
        return studentRepository.findByName(name);
    }

    @Override
    public Student findByNameAndSurname(String name, String surname) {
        return studentRepository.findByNameAndSurname(name, surname);

    }

    @Override
    public List<Student> findByAge(Integer age) {
        return studentRepository.findByAge(age);
    }

    @Override
    public List<Student> findByAges(Integer minAge, Integer maxAge) {
        return studentRepository.findByAges(minAge, maxAge);
    }

    @Override
    public long getCount() {
        return studentRepository.getCount();
    }

    @Override
    public void create(Student student) {
        studentRepository.save(student);
    }

    @Override
    public void update(Student student) {
        Student oldStudent = studentRepository.findById(student.getId()).get();
        oldStudent.setName(student.getName());
        oldStudent.setSurname(student.getSurname());
        oldStudent.setAge(student.getAge());
        oldStudent.setEmail(student.getEmail());
    }

    @Override
    public void delete(Long id) {
        Student student = studentRepository.findById(id).get();
        studentRepository.delete(student);
    }
}

