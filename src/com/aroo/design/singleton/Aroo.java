package com.aroo.design.singleton;

public class Aroo extends Thread{
    private Toy toy;

    public Aroo(){
        this.toy = Toy.getInstance();
    }

    public Toy getToy(){
        return this.toy;
    }

    public void run(){
        Toy.getInstance().showName(Toy.getInstance().toString());
    }
}
