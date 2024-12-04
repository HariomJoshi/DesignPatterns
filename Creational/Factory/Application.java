package Creational.Factory;

public class Application {
    public static void main(String[] args) {
       Transport tp = Factory.createTransport("water");
       tp.deliver();

    }
}
