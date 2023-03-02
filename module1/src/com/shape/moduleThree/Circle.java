package com.shape.moduleThree;

public class Circle extends TwoDShape {
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
        return "Circle: radius = " + radius + ", area = " + getArea();
    }
}
