package com.example.demo.model;

public class Student {

    private final UUID id;
    private String name;

    public Student(UUID id, String name) {
        this.id = id;
        this.name = name;
    }
}
