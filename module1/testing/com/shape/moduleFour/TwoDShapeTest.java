package com.shape.moduleFour;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoDShapeTest {
    @Test public void testGetArea(){
//  circle
        Circle testCircle = new Circle(3);
        double a = Math.PI;
        Assertions.assertEquals(3*3*a, testCircle.getArea(), .0001);
//  Triangle
        Triangle testTri = new Triangle(5, 12, 13);
        Assertions.assertEquals(30, testTri.getArea(), .0001);
    }
}