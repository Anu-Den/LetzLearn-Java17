package com.letzlearn.java17.record;

import com.letzlearn.java17.record.interfaces.Sales;

public record Customer(int custId, String custName, String gender, String custEmail, String custAddress) implements Sales {

/*
    instance field not allowed
    private long custPhoneNo;
*/

    // allows static variable
    private static final String TITLE_MR="Mr.";
    private static final String TITLE_MS="Ms.";
    private static int discount =3;

    //can have explicit constructor
    public Customer(int custId, String custName,String gender, String custEmail, String custAddress){
        if(custId<=0)
            throw new IllegalArgumentException(" Invalid Customer Id");
        this.custId=custId;
        this.custName=custName;
        this.gender=gender;
        this.custEmail=custEmail;
        this.custAddress=custAddress;
    }

    // nonstatic method allowed
    public String getNameInUppercase(){
        return custName.toUpperCase();
    }

    // Static method allowed
    public static String getTitleAndName(Customer customer){
        return customer.gender == "M" ? TITLE_MR.concat(customer.custName()) : TITLE_MS.concat(customer.custName());

    }

    @Override
    public int applyDiscount() {
        return discount;
    }
}
