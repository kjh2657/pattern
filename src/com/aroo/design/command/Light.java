package com.aroo.design.command;

public class Light {

    private String loc;

    public Light(String loc) {
        this.loc = loc;
    }

    public void on(){
        System.out.println(loc + " Ligth On!!!");
    }

    public void off(){
        System.out.println(loc + "Light Off!!!");
    }
}
