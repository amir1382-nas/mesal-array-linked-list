package org.example;

import java.util.ArrayList;
import java.util.Objects;
public class Student {
        private String name;

        public Student(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{name='" + name + "'}";
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return Objects.equals(name, student.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
