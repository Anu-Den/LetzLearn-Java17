package com.letzlearn.java17.sealed;

public final class Square implements Shape {

    double side;
    Square(double side){
        this.side= side;
    }
    @Override
    public void findArea() {
        System.out.println("Area of Square is: "+ side*side);
    }
}
