package org.example;


import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> l = new LinkedList<String>();
        l.add("A");
        l.add("B");
        l.add("S");
        String string = l.get(0);
        l.remove(0);
    }
}