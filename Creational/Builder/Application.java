package Creational.Builder;

public class Application {
    // builder design pattern is basically used for initialization
    // when we have loads of constructors (initialization with constructors)
    public static void main(String[] args) {
        CarBuilder builder = new CarBuilder();
        builder.width(23).height(45).brand("Maruti").doors(4).sunroof(false);
        Car car = builder.build();
        System.out.println(car.getBrand());

        // with director our implementation details are hidden more
        builder = new CarBuilder();
        Director director = new Director();
        director.buildMahindra(builder);
        Car mahindraCar = builder.build();
        System.out.println(mahindraCar.getBrand() +" "+ mahindraCar.getModel());
    }

}
