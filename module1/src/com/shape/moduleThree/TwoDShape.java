package com.shape.moduleThree;

public abstract class TwoDShape {
    //    the super class of all
    public double width;
    public double height;
    public TwoDShape(double width, double height){
        this.width = width;
        this.height = height;
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