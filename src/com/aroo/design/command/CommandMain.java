package com.aroo.design.command;

public class CommandMain {
    public static void main(String[] args) {

        RemoteControl remoteControl = new RemoteControl();

        Light LivingLight = new Light("Living Room ");
        Command ligthCommand = new LightCommand(LivingLight);

        Light roomLight = new Light("Room ");
        Command roomCommand = new LightCommand(roomLight);

        AirConditioner airConditioner = new AirConditioner();
        Command airconCommand = new AirConditionerCommand(airConditioner);

        remoteControl.setCommand(ligthCommand);
        remoteControl.setCommand(roomCommand);
        remoteControl.btnPressed(2);
        remoteControl.setCommand(airconCommand);
        remoteControl.btnPressed(0);
        remoteControl.btnPressed(1);
        remoteControl.btnPressed(1);
        remoteControl.btnPressed(2);
    }
}
