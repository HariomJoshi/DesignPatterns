package Creational.AbstractFactory.concrete.victorian;

import Creational.AbstractFactory.interfaces.Chair;
import Creational.AbstractFactory.interfaces.FurnitureFactory;
import Creational.AbstractFactory.interfaces.Sofa;
import Creational.AbstractFactory.interfaces.Table;

public class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair(){
        return new VictorianChair();
    }

    @Override
    public Table createTable(){
        return new VictorianTable();
    }

    @Override
    public Sofa createSofa(){
        return new VictorianSofa();
    }
}
