package Creational.Builder;

public class Director {

    public void buildMaruti(CarBuilder builder){
        builder.brand("Maruti").sunroof(false).doors(4);
    }

    public void buildMahindra(CarBuilder builder){
        builder.brand("Mahindra").sunroof(true).doors(2).model("Thar");
    }
}
