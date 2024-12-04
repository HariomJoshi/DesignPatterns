package Behavioural.cor.concrete;

public class PasswordMatchHandler extends Handler {
    @Override
    public boolean handle(String usrname, String password){
        if(true){
            System.out.println("Password Matched!");
            return handleNext(usrname, password);
        }else{
            return false;
        }
    }
}
