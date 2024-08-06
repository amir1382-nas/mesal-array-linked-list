package org.example;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new LinkedList<String>();
        list.add("Ali");
        list.add("Taghi");
        System.out.println(list.get(1));
        list.remove("Taghi");
        for (String string : list){
            System.out.println(string);
        }
    }
}