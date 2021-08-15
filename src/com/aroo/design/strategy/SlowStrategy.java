package com.aroo.design.strategy;

public class SlowStrategy implements IRunStrategy{
    @Override
    public void run() {
        System.out.println("Run slowly");
    }
}
