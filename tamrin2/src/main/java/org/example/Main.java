package org.example;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Collections<Integer> s = new HashSet<Integer>();
        s.add(6);
        s.add(7);
        s.add(5);

//        Objects[] array = s.toArray();

        Integer[] is = s.toArray(new Integer[s.size()]);
    }
}