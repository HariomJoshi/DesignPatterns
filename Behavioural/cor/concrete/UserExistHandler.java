package Behavioural.cor.concrete;

public class UserExistHandler extends Handler{

    @Override
    public boolean handle(String username, String password) {
        // perform operation
        // It's responsibility is just to check whether user exists or not
        // if it returns true, so the code will proceed to the next handler
        // if returns false so the code will be terminated
        boolean condition = true;
        if(condition){
            System.out.println("User exists! ");
            return handleNext(username, password);
        }else{
            return false;
        }
    }
}
