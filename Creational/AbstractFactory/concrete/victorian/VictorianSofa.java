package Creational.AbstractFactory.concrete.victorian;

import Creational.AbstractFactory.interfaces.Sofa;

public class VictorianSofa implements Sofa {

    @Override
    public String getModel() {
        return "Victorian Sofa";
    }

    @Override
    public boolean isExpensive() {
        return false;
    }
}
