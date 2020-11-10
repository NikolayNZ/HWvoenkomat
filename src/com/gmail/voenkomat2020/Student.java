package com.gmail.voenkomat2020;

import java.util.Scanner;

public class Student extends Human {
    private int course;


    public Student(String name, String lastname, int age, String sex, int course) {
        super(name, lastname, age, sex);
        this.course = course;
    }

    public Student() {
        super();
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return   super.toString() +
                "Студент " +
                "Курс: " + course;
    }
}
