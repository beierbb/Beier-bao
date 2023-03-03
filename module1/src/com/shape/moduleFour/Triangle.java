package com.shape.moduleFour;

import com.shape.moduleThree.Rotate;

public class Triangle extends TwoDShape implements Rotate {
    //    A subclass of TwoShape and define it with color and sides
    double side1;
    double side2;
    double side3;
    public Triangle(double width, double height, Color color){
        this.width = width;
        this.height = height;
        this.color = color;
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
        heronsHeight();
        return height*side2/2;
    }
    //    toString method including the getArea methods - will be tested in Main class
    @Override
    public String toString(){
        return "Triangle: color = " + color + "side 1 = " + side1 + ", side 2 = " + side2 + ", side 3 = " + side3 + ", area = " + getArea();
    }
//    Rotation, see the specific things in interface
    double rotateAngle = angle;
    @Override
    public void rotate90() {
        rotateAngle += 90;
    }

    @Override
    public void rotate180() {
        rotateAngle += 180;
    }

    @Override
    public void rotate(double degree) {
        rotateAngle += degree;
    }
}