package com.letzlearn.java17.sealed;

public class Client {

    public static void main(String[] args) {
        // sealed class
        ContractEmployee contractEmployee = new ContractEmployee();
        contractEmployee.displayEmployee();
        contractEmployee.displayContractEmployee();
        contractEmployee.displayPermanentEmployee();

        // sealed interface
        Shape circle = new Circle(3);
        Shape rec = new Rectangle(3.4, 5.0);
        Square sq = new Square(5);
        circle.findArea();
        rec.findArea();
        sq.findArea();
    }
}
