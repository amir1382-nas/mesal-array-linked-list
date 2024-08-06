package org.example;


import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Rectangle {
    private int length , width;

    public Rectangle (int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null )
            return false;
        if (getClass() != obj.getClass())
        return false;
        Rectangle other = (Rectangle) obj;
        if (length != other.length)
            return false;
        if (width != other.width)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, width);
    }
}
public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10,5);
        Rectangle r2 = new Rectangle(10,5);

        System.out.println(r1.equals(r2));

        Set<Rectangle> list = new HashSet<Rectangle>();
        list.add(r1);
        System.out.println(list.contains(r2));
    }
}