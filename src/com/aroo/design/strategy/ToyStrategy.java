package com.aroo.design.strategy;

public class ToyStrategy implements IPlayStrategy{
    @Override
    public void play() {
        System.out.println("Play with Toy");
    }
}
