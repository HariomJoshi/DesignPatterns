package Creational.prototype.concrete;

import Creational.prototype.interfaces.Prototype;

public class Car implements Prototype {
    private String model, brand;
    private int doors;
    public Car(String model, String brand, int doors){
        this.model = model;
        this.brand = brand;
        this.doors = doors;
    }

    public void printDetails(){
        System.out.println(brand + " "+ model + " with " + doors + " doors. ");
    }

    // constructor for prototype pattern
    Car(Car car){
        this.model = car.model;
        this.brand = car.brand;
        this.doors = car.doors;
    }

    @Override
    public Car clone() {
        return new Car(this);
    }
}
