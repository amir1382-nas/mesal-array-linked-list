package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("Ali Alavi"));
        students.add(new Student("Taghi Taghavi"));
        students.remove(0);
        students.remove(new Student("Ali ََAlavi"));
        Student student = students.get(0);
        System.out.println(student);
    }
}