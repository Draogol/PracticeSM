package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.db.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository repository;

    @Override
    public void addStudent(String name, String passportNumber) {
        Student student = new Student();
        student.setName(name);
        student.setPassportNumber(passportNumber);
        repository.save(student);
    }

    @Override
    public List<Student> findAll() {
        return repository.findAll();
//                .stream()
//                .map(Student::toString)
//                .collect(Collectors.joining(","));
    }
}
