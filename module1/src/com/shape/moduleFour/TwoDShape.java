package com.shape.moduleFour;

public abstract class TwoDShape {
//    the super class of all
    public double width;
    public double height;
    Color color;
    public TwoDShape(double width, double height, Color color){
        this.width = width;
        this.height = height;
        this.color = color;
    }
    public TwoDShape(){

    }

    public void setHeight(double height) {
        this.height = height;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight(double height){
        return height;
    }
    public double getWidth(double width){
        return width;
    }
    abstract double getArea();
}