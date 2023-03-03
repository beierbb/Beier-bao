package com.shape.moduleThree;

public class Circle extends TwoDShape {
    //    A subclass of TwoShape and define it with color and radius
    public final double PI = Math.PI;
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return PI*(radius*radius);
    }
    //    toString method including the getArea methods - will be tested in Main class
    @Override
    public String toString(){
        return "Circle: radius = " + radius + ", area = " + getArea();
    }
}
