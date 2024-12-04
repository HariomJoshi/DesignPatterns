package Creational.AbstractFactory.concrete.modern;

import Creational.AbstractFactory.interfaces.Sofa;

public class ModernSofa implements Sofa {
    @Override
    public String getModel() {
        return "Modern Sofa";
    }

    @Override
    public boolean isExpensive(){
        return true;
    }
}
