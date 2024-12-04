package Structural.Adapter;

import Structural.Adapter.concrete.INRPayment;
import Structural.Adapter.concrete.PaymentAdapter;
import Structural.Adapter.interfaces.PaymentToInr;

public class Application {
    public static void main(String[] args) {
        // current code
        PaymentToInr payment = new INRPayment();
        payment.payMoney(12345);
        // now we want to support INR to USD payment
        // create a new payment Adapter
        PaymentToInr newPayment = new PaymentAdapter();
        newPayment.payMoney(12345); // working the same
    }
}
