package Structural.Proxy.concrete;

import Structural.Proxy.interfaces.DBInterface;

public class DBproxy implements DBInterface {
    // Original Object
    DB realObject;
    public DBproxy(DB db){
        realObject = db;
    }

    @Override
    public void create() {
        realObject.create();
        System.out.println("After creation operation");
    }

    @Override
    public void read() {
        System.out.println("Before read operation");
        realObject.read();
    }

    @Override
    public void update() {
        realObject.update();
        System.out.println("After updation Operation");
    }

    @Override
    public void delete() {
        realObject.delete();
    }
}
