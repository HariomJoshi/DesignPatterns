package Structural.Adapter.concrete;

import Structural.Adapter.interfaces.PaymentToInr;

public class PaymentAdapter implements PaymentToInr {
    USDPayment payment;
    public PaymentAdapter(){
        payment = new USDPayment();
    }

    @Override
    public void payMoney(int amountInInr) {
        System.out.println("Rupees paid: " + amountInInr + " .");
        int dollars = amountInInr/80;
        // using the functionality of other incompatible class
        payment.payMoney(dollars);
    }

}
