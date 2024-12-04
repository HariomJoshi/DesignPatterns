package Structural.Adapter.concrete;

import Structural.Adapter.interfaces.PaymentToDollars;

public class USDPayment implements PaymentToDollars {
    @Override
    public void payMoney(int amount) {
        System.out.println("Dollars paid: " + amount + " .");
    }
}
