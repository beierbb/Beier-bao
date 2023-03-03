package com.shape.moduleFour;

public class Circle extends TwoDShape {
//    A subclass of TwoShape and define it with color and radius
    public final double PI = Math.PI;
    private double radius;
    public Circle(Color color) {
        this.color = color;
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return PI*(radius*radius);
    }
//    toString method including the getArea methods - will be tested in Main class
    @Override
    public String toString(){
        return "Circle: color = " + color + " radius = " + radius + ", area = " + getArea();
    }
}
