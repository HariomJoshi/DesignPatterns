package Behavioural.cor.concrete;

public class PasswordExistHandler extends Handler{
    @Override
    public boolean handle(String username, String password){
        if(true){
            System.out.println("Password valid");
            return handleNext(username, password);
        }else{
            return false;
        }
    }
}
