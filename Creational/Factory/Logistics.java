package Creational.Factory;

public abstract class Logistics {
    public void planDelivery(){
        Transport t = createTransport();
        t.deliver();
        System.out.println("Planning delivery");
    }

    public abstract Transport createTransport();
}
