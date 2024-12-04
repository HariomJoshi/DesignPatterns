package Structural.Adapter.concrete;

import Structural.Adapter.interfaces.PaymentToInr;

public class INRPayment implements PaymentToInr {
    @Override
    public void payMoney(int amount) {
        System.out.println("Rupees paid: " + amount + " .");
    }
}
