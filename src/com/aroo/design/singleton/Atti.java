package com.aroo.design.singleton;

public class Atti extends Thread{
    private Toy toy;

    public Atti(){
        this.toy = Toy.getInstance();
    }

    public Toy getToy(){
        return this.toy;
    }

    public void run(){
        Toy.getInstance().showName(Toy.getInstance().toString());
    }
}
