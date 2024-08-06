package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        Random random = new Random();
        Object temp;
        for (int i = 0; i < 100000; i++) {
            if (!list.isEmpty()) {
                temp = list.get(random.nextInt(list.size()));
            }
        }
    }
}