package com.letzlearn.java17.sealed;

public sealed class Employee permits PermanentEmployee{

    void displayEmployee(){
        System.out.println("Inside Employee class");
    }
}
