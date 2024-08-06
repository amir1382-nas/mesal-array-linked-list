package org.example;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("Ali");
        set.add("Taghi");
        set.add("Taghi");
        set.add("Ali");
        set.add("Taghi");
        System.out.println(set.size());
        for (String str : set)
            System.out.println(str);
        set.remove("Ali");
        System.out.println(set.contains("Ali"));
        System.out.println(set.contains("Taghi"));
        set.clear();
        System.out.println(set.size());
    }
}