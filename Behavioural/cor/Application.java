package Behavioural.cor;

import Behavioural.cor.concrete.*;

public class Application {
    public static void main(String[] args) {
        // There is a chain of single responsibility classes (or we can say handlers)
        Handler handler = new UserExistHandler()
                .setNextHandler(new PasswordExistHandler())
                .setNextHandler(new PasswordMatchHandler())
                .setNextHandler(new OTPHandler());
        AuthService service = new AuthService(handler);
        service.login("Hariom", "Joshi");
    }
}
