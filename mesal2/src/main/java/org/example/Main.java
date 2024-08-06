package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.next();
            if (input.equalsIgnoreCase("exit"))
                break;
            list.add(input);
        }
        if (list.isEmpty()) {
            System.out.println("no string entered");
        } else {
            System.out.println(list.size());
            if (list.contains("Ali"))
                System.out.println("Ali found!!");
            for (String s : list) {
                System.out.println(s);
            }
        }
//        System.out.println("Hello world!");
    }
}