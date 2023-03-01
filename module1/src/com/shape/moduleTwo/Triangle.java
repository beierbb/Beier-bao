package com.shape.moduleTwo;

import com.shape.moduleOne.TwoDShape;

public class Triangle extends TwoDShape {
    double side1;
    double side2;
    double side3;
    public Triangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    private double heronsHeight(){
        double s = (side1 + side2 + side3)/2;
        double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        height = area*2/side2;
        return height;
    }
    @Override
    public double getArea(){
        return height*side2/2;
    }
    @Override
    public String toString(){
        return "Triangle: side 1 = " + side1 + ", side 2 = " + side2 + ", side 3 = " + side3;
    }
}