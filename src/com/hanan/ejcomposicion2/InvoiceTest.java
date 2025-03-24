package com.hanan.ejcomposicion2;

public class InvoiceTest {
    public static void main(String[] args) {
        Customer customer= new Customer(2, "Federico", 25);
        Invoice invoice = new Invoice(4, customer, 1400);

        System.out.println(customer);
        System.out.println(invoice);
        System.out.println(invoice.getAmountAfterDiscount());
    }
}
