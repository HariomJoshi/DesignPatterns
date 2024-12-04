package Creational.AbstractFactory;

import Creational.AbstractFactory.concrete.modern.ModernFurnitureFactory;
import Creational.AbstractFactory.concrete.victorian.VictorianFurnitureFactory;
import Creational.AbstractFactory.interfaces.Chair;
import Creational.AbstractFactory.interfaces.FurnitureFactory;

public class Application {
    public static void main(String[] args) {
        FurnitureFactory factory = createFactory("Modern");
        Chair chair = factory.createChair();
        System.out.println(chair.getModel());


    }

    public static FurnitureFactory createFactory(String arg){
        if(arg.equals("Modern")){
            return new ModernFurnitureFactory();
        }else{
            return new VictorianFurnitureFactory();
        }
    }
}
