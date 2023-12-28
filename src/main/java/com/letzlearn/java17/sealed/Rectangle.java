package com.letzlearn.java17.sealed;

public non-sealed class Rectangle implements Shape {

    double length;
    double width;

    Rectangle(double length, double width){
        this.length=length;
        this.width=width;
    }
    @Override
    public void findArea() {
        System.out.println("Area of Rectangle is: "+ length*width);
    }
}
