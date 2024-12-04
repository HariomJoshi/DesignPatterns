package Structural.Proxy;

import Structural.Proxy.concrete.DB;
import Structural.Proxy.concrete.DBproxy;

public class Application {
    public static void main(String[] args) {
        // earlier code
        DB db = new DB();
        db.create();
        System.out.println("After creation operation");
        // we need to do some operation after creation so we need to do that here
        // but, proxy saves us from this
        DBproxy proxy = new DBproxy(db);
        proxy.create();
        // the after operation is done in the create method of the proxy class only
    }
}
