package Creational.AbstractFactory.concrete.modern;

import Creational.AbstractFactory.interfaces.Chair;
import Creational.AbstractFactory.interfaces.FurnitureFactory;
import Creational.AbstractFactory.interfaces.Sofa;
import Creational.AbstractFactory.interfaces.Table;

public class ModernFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }
}
