package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<String, Double>();
        map.put(new String("Ali Alavi"), (18.76));
        map.put(new String("Taghi Taghavi"), (15.43));
        map.put(new String("Naghi Naghavi"), (17.26));
        map.put(new String("Naghi Naghavi"), (15.26));
        map.remove(new String("Naghi Naghavi"));

        Double grade = map.get(new String("Taghi Taghavi"));
        System.out.println("Grade of Taghi=" + grade);

        for (String student : map.keySet())
            System.out.println(student.toString());

        Double totalsum = 0.0;
        for (Double avg : map.values())
            totalsum += avg;

        System.out.println("Average =" + (totalsum / map.size()));
    }
}