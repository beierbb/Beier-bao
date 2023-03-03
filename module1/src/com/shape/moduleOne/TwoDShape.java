package com.shape.moduleOne;

public class TwoDShape {
    //    the super class of all
    public double width;
    public double height;
    public TwoDShape(double width, double height){
        this.width = width;
        this.height = height;
    }
    public TwoDShape(){

    }
    public double getArea(){
        return width*height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}