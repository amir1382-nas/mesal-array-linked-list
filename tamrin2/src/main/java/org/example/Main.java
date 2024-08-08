package org.example;

import java.util.Collection;
import java.util.HashSet;


public class Main {
    public static void main(String[] args) {
        Collection<Integer> s = new HashSet<Integer>();

        s.add(6);
        s.add(7);
        s.add(5);

        Object[] array = s.toArray();

        Integer[] is = s.toArray(new Integer[s.size()]);
    }
}