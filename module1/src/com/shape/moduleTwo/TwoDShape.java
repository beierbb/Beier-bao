package com.shape.moduleTwo;

public abstract class TwoDShape {
    //    the super class of all, and was made abstract
    public double width;
    public double height;
    public TwoDShape(double width, double height){
        this.width = width;
        this.height = height;
    }
    public TwoDShape(){

    }
//    Setters and getters for the height and weight
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
//    was made abstract
    abstract double getArea();
}