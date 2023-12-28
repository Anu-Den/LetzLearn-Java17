package com.letzlearn.java17.sealed;

public class ContractEmployee extends PermanentEmployee{
    void displayContractEmployee(){
        System.out.println("Inside Contract Employee");
    }

    @Override
    void displayEmployee(){
        System.out.println("inside overriding method : displayEmployee ()");
    }
}
