package com.aroo.design.observer;

public class ObserverMain {
    public static void main(String[] args) {

        ArooPage arooPage = new ArooPage();
        ArooFan bam = new ArooFan("bam");
        ArooFan pang = new ArooFan("pang");
        ArooFan duboo = new ArooFan("duboo");

        arooPage.subscribe(bam);
        arooPage.subscribe(pang);
        arooPage.subscribe(duboo);

        arooPage.setArooNew("Cute Aroo", "Sooooooo Cute");


        arooPage.desubscribe(duboo);

        arooPage.setArooNew("Handsome Aroo", "Hot guy Aroo");
    }
}
