package com.shape.moduleTwo;

public class Circle {
    public final double PI = Math.PI;
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return PI*(radius*radius);
    }
    @Override
    public String toString(){
        return "Circle: radius = " + radius;
    }
}
