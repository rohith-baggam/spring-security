package com.example.SpringSecEx.controller;

public class Student {
    private int id;
    private String name;
    private int marks;

    public int get_id() {
        return id;
    }

    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public String get_name() {
        return name;
    }

    public int get_marks() {
        return marks;
    }

    public void set_id(int id) {
        this.id = id;
    }

    public void set_name(String name) {
        this.name = name;
    }

    public void set_marks(int marks) {
        this.marks = marks;
    }

}
