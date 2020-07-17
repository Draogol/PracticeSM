package com.example.demo.service;

import com.example.demo.model.Student;

import java.util.List;

public interface StudentService {
    void addStudent(String name, String passportNumber);

    List<Student> findAll();
}
