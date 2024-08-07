package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap();
        map.put("Laptop", "Computers");
        map.put("Shahnameh", "Books");
        map.put("Tablet", "Books");
        map.put("Tablet", "Computers");
        System.out.println(map.size());
        System.out.println((String)map.get("Tablet"));
        System.out.println((String)map.get("GOLESTAN"));
        System.out.println(map.containsKey("TABLET"));
        System.out.println(map.containsValue("Books"));
    }
}