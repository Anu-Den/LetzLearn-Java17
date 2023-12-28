package com.letzlearn.java17;

import com.letzlearn.java17.record.Customer;

public class Main {
    public static void main(String[] args) {
        Customer cus= new Customer(07,"Chris","M","chris@gmail.com","India");
        System.out.println(cus);
        System.out.println(Customer.getTitleAndName(cus)
                +" lives in "+cus.custAddress());
        System.out.println(cus.getNameInUppercase());
        System.out.println("Discount available: "+cus.applyDiscount());

        // this will THROW Illegal Argument Exception and stops execution
        Customer cus1= new Customer(0,"Joss","M","joss@gmail.com","UK");
        System.out.println(cus1);

    }
}