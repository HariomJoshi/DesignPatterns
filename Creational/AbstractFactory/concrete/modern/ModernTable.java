package Creational.AbstractFactory.concrete.modern;

import Creational.AbstractFactory.interfaces.Table;

public class ModernTable implements Table {
    @Override
    public String getModel() {
        return "Modern Table";
    }
}
