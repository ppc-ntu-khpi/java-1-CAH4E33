package test;

import domain.customer;

public class CustomerTest {

    public static void main(String[] args) {
        customer cus = new customer();
        cus.displayCustomerInfo();
        cus.setTotal(-1.2F);
        cus.setNew(false);
        cus.setID(12);
        cus.displayCustomerInfo();


    }

}
