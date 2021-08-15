package com.aroo.design.command;

public class LightCommand implements Command{

    private Light light;
    private static boolean bOn = false;


    public LightCommand(Light light) {
        this.light = light;
    }

    public void setLight(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        if (bOn == true) {
            light.off();
            bOn = false;
        } else {
            light.on();
            bOn = true;
        }
    }
}
