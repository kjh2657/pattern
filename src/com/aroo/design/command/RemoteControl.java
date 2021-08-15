package com.aroo.design.command;

import java.util.Arrays;

public class RemoteControl {

    Command[] command;

    private int cnt = 0;
    private int MAX_COUNT = 3;

    public RemoteControl() {
        command = new Command[MAX_COUNT];
        NoCommand noCommand = new NoCommand();

        for(int i = 0; i < MAX_COUNT; i++){
            command[i] = noCommand;
        }

    }

    public void setCommand(Command command) {
        if (cnt <= MAX_COUNT) {
            this.command[cnt] = command;
            cnt++;
        } else {
            System.out.println("FULL");
        }
    }

    public void btnPressed(int slot) {
        command[slot].execute();
    }
}
