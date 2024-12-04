package Creational.AbstractFactory.concrete.victorian;

import Creational.AbstractFactory.interfaces.Chair;

public class VictorianChair implements Chair {
    @Override
    public String getModel() {
        return "Victorian Chair";
    }

    @Override
    public String sitOn() {
        return "Soft cushion";
    }
}
