package Behavioural.cor.concrete;

public class OTPHandler extends Handler{
    @Override
    public boolean handle(String username, String password){
        if(true){
            System.out.println("OTP verified");
            return handleNext(username, password);
        }else{
            return false;
        }
    }
}
