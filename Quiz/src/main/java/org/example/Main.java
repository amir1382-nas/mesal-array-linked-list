package org.example;


import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> list = new LinkedList<Object>();
        for (int i=0;i<1000000;i++);{
            for (int j=0;j<100;j++)
                list.add(0, new Object());
            for (int j=0;j<100;j++)
                list.remove(0);
        }
    }
}