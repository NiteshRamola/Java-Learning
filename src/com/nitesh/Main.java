package com.nitesh;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(1, 2);
        Point point1 = point;

        point1.x = 5;

        System.out.println(point1);
    }
}