package com.letzlearn.java17.sealed;

public final class Circle implements Shape {
    double radius;

    Circle(double radius){
        this.radius=radius;
    }

    @Override
    public void findArea() {
        System.out.println("Area of Circle is: "+ Math.PI*radius*radius);
    }
}
