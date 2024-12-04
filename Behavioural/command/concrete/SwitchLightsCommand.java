package Behavioural.command.concrete;

import Behavioural.command.interfaces.Command;
import Behavioural.command.interfaces.Light;

public class SwitchLightsCommand implements Command{
    private Light light;

    public SwitchLightsCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute(){
        light.switchLight();
    }
}
