package Behavioural.command.concrete;

import Behavioural.command.interfaces.Command;

public class TurnOnBlindsCommand implements Command {
    boolean state = false;
    private Blinds blind;
    public TurnOnBlindsCommand(Blinds blind){
        this.blind = blind;
    }

    @Override
    public void execute() {
        if(state){
            blind.turnOff();
        }else{
            blind.turnOn();
        }
        state = !state;
    }
}
