package com.aroo.design.strategy;

public class FastStrategy implements IRunStrategy{
    @Override
    public void run() {
        System.out.println("Run fastly");
    }
}
