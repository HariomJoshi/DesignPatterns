package Creational.AbstractFactory.concrete.modern;

import Creational.AbstractFactory.interfaces.Chair;

public class ModernChair implements Chair {
    @Override
    public String getModel(){
        return "Modern chair";
    }
    @Override
    public String sitOn(){
        return "4 Legs";
    }
}
