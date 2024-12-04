package Creational.Builder;

public class Car {
    private String model, brand;
    private int doors, width, height, safetyRating;

    public boolean isSunroof() {
        return sunroof;
    }

    public int getSafetyRating() {
        return safetyRating;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getDoors() {
        return doors;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    private boolean sunroof;

    Car(String model, String brand, int doors, int width, int height, int safetyRating, boolean sunroof){
        this.model = model;
        this.brand = brand;
        this.doors = doors;
        this.width = width;
        this.height = height;
        this.safetyRating = safetyRating;
        this.sunroof = sunroof;
    }
}
