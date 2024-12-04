package Behavioural.command;

import Behavioural.command.concrete.*;

public class Application {
    public static void main(String[] args) {
        Room bedRoom = new Room();
        bedRoom.setCommand(new SwitchLightsCommand(new BedroomLight()));
        bedRoom.executeCommand();
        bedRoom.setCommand(new TurnOnBlindsCommand(new Blinds()));
        bedRoom.executeCommand();
        bedRoom.executeCommand();
    }
}

