package org.example;

import java.util.Iterator;
import java.util.List;

public class Main {
    public static void removeAli(List<String> list) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String string = iterator.next();
            if (string.startsWith("Ali"))
                iterator.remove();
        }
    }
}