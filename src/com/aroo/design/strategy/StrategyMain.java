package com.aroo.design.strategy;

public class StrategyMain {

    public static void main(String[] args) {

        PlayWithDog playWithAroo = new PlayWithAroo("Aroo");
        PlayWithDog playWithAtti = new PlayWithAtti("Atti");

        playWithAroo.setPlayStrategy(new DollStrategy());
        playWithAroo.setRunStrategy(new FastStrategy());
        playWithAtti.setPlayStrategy(new ToyStrategy());
        playWithAtti.setRunStrategy(new FastStrategy());

        System.out.println("====== Play  : " + playWithAroo.getName());
        playWithAroo.play();
        playWithAroo.run();

        System.out.println();
        System.out.println("====== Play  : " + playWithAtti.getName());
        playWithAtti.play();
        playWithAtti.run();

    }
}
