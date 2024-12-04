package Behavioural.command.concrete;

import Behavioural.command.interfaces.Light;

public class BedroomLight implements Light {
    boolean lightState = false;
    @Override
    public void switchLight() {
        System.out.println("Switching the bedroom lights");
        lightState = !lightState;
    }
}
