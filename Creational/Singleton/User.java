package Creational.Singleton;

public class User {
    private static volatile User instance;
    private String name;
    private User(){
        // just to prevent initialization
    }

    public static User getInstance(){
        if(instance == null){
            synchronized (User.class){
                if(instance == null){
                    instance = new User();
                }
            }
        }
        return instance;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
