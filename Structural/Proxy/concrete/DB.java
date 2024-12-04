package Structural.Proxy.concrete;

import Structural.Proxy.interfaces.DBInterface;

public class DB implements DBInterface {
    @Override
    public void create() {
        System.out.println("Entry Created");
    }

    @Override
    public void read() {
        System.out.println("Entry Read");
    }

    @Override
    public void update() {
        System.out.println("Entry Updated");
    }

    @Override
    public void delete() {
        System.out.println("Entry Deleted");
    }
}
