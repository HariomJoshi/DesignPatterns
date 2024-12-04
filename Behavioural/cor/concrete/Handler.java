package Behavioural.cor.concrete;

public abstract class Handler {
    private Handler nextHandler;
    public Handler setNextHandler(Handler nextHandler){
        this.nextHandler = nextHandler;
        return nextHandler;
    }

    public abstract boolean handle(String username, String password);

    public boolean handleNext(String username, String password){
        if(nextHandler == null){
            return true;
        }
        return nextHandler.handle(username, password);
    }
}
