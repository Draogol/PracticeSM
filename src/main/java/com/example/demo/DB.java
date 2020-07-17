package com.example.demo;

import org.hibernate.annotations.Entity;
import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;

@Entity
class Student {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String passportNumber;
}
