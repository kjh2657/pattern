package com.aroo.design.observer;

public class ArooFan implements Observer{

    private String name;

    public ArooFan(String name) {
        this.name = name;
    }

    @Override
    public void update(String title, String desc) {

        System.out.println("----------------Aroo--------------");
        System.out.println("this week title  = " + title);
        System.out.println("this week desc   = " + desc);
        System.out.println("like this article By " + name);
        System.out.println("----------------------------------");
    }
}
