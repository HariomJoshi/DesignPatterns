package Creational.prototype;

import Creational.prototype.concrete.Car;

public class Application {
    public static void main(String[] args) {
        // if you want to copy the functionality of any class
        // PROTOTYPE: this delegates the object duplication
        // of cloning process to the actual objects that are being cloned
        // without coupling the creation of objects to its class

        // Shallow copy -> changes will be reflected in both the objects
        // Deep copy -> changes in one will not be reflected in the other
        Car car = new Car("Swift", "Maruti Suzuki", 4);
        car.printDetails();
        Car secondCar = car.clone();
        secondCar.printDetails();
    }
}
