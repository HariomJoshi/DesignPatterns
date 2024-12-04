package Creational.Builder;

public class CarBuilder {
    private String model, brand;
    private int doors, width, height, safetyRating;
    private boolean sunroof;
    public CarBuilder model(String model){
        this.model = model;
        return this;
    }

    public CarBuilder brand(String brand){
        this.brand = brand;
        return this;
    }

    public CarBuilder doors(int doors){
        this.doors = doors;
        return this;
    }

    public CarBuilder width(int width){
        this.width = width;
        return this;
    }

    public CarBuilder height(int height){
        this.height = height;
        return this;
    }

    public CarBuilder safetyRating(int rating){
        this.safetyRating = rating;
        return this;
    }

    public CarBuilder sunroof(boolean sunroof){
        this.sunroof =sunroof;
        return this;
    }


    public Car build(){
        return new Car(model, brand, doors, width, height, safetyRating, sunroof);
    }
}
