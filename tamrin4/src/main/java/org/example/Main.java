package org.example;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("Java",20);
        map.put("Shahnameh",30);
        map.put("Golestan",25);
        map.put("Golestan",40);
        map.put("Shahnameh",45);
        map.put("Shahnameh",20);

        Set<String> set = map.keySet();
        Collection<Integer> c = map.values();
    }
}