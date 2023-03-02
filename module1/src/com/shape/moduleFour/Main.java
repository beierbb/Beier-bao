package com.shape.moduleFour;

import com.shape.moduleTwo.Circle;
import com.shape.moduleTwo.Triangle;
import com.shape.moduleTwo.TwoDShape;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
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