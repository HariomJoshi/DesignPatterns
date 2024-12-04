package Behavioural.cor.concrete;

public class AuthService {
    private Handler handler;
    public AuthService(Handler handler){
        this.handler = handler;
    }

    public boolean login(String username, String password){
        if(handler.handle(username, password)){
            System.out.println("Logged In!");
            return true;
        }else{
            System.out.println("Some error occured while logging in! ");
            return false;
        }
    }
}
