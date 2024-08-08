package org.example.rectangle;

import java.util.Objects;

public class Rectangle {
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
