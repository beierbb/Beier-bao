package com.shape.moduleTwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //      Creat two variables to test the toString and getArea methods
        Circle cir = new Circle(3);
        Triangle tri = new Triangle(3, 4, 5);
        ArrayList<TwoDShape> check = new ArrayList<>();
        check.add(cir);
        check.add(tri);
        for (TwoDShape seeCorrect : check) {
            System.out.println(seeCorrect);
        }
    }
}