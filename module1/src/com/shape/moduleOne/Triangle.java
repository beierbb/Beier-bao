package com.shape.moduleOne;

import com.shape.moduleOne.TwoDShape;

public class Triangle extends TwoDShape {
    //    A subclass of TwoShape and define it with color and sides
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
    //    Using the Herons formula to get the height here since we only know the sides.
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
}