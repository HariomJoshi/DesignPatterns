package Creational.AbstractFactory.concrete.victorian;

import Creational.AbstractFactory.interfaces.Table;

public class VictorianTable implements Table {
    @Override
    public String getModel() {
        return "Victorian Table";
    }
}
