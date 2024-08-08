package org.example;


import org.example.rectangle.Rectangle;

import java.util.HashSet;
import java.util.Set;


public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(18,5);
        Rectangle r2 = new Rectangle(10,10);

        System.out.println(r1.equals(r2));

        Set<Rectangle> list = new HashSet<Rectangle>();
        list.add(r1);
        System.out.println(list.contains(r2));
    }
}