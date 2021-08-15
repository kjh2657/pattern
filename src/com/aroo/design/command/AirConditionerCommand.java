package com.aroo.design.command;

public class AirConditionerCommand implements Command{

    private AirConditioner airConditioner;
    private static boolean bOn = false;

    public AirConditionerCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    public void setAirConditioner(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        if (bOn == true) {
            airConditioner.off();
            bOn = false;
        } else {
            airConditioner.on();
            bOn = true;
        }
    }
}
