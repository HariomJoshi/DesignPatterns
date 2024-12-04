package Creational.Factory;

// this is Factory class
public class Factory {
    public static Transport createTransport(String medium){
        if(medium.equals("water")){
            return new Ship();
        }else if(medium.equals("road")){
            return new Truck();
        }else{
            // default case
            return new Truck();
        }
    }
}
