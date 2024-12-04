package Creational.Singleton;

public class Application {
    public static void main(String[] args) {
        User user = User.getInstance();
        user.setName("Hariom");

        User anotherInstance = User.getInstance();
        System.out.println(anotherInstance.getName()); // we will get the same name
        // it is returning the same instance in the background
    }
}
