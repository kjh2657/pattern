package com.aroo.design.observer;

import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;



@NoArgsConstructor
public class ArooPage implements Publisher{

    private List<Observer> observers = new ArrayList<>();
    private String title;
    private String description;

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void desubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void showAroo() {
        observers.forEach(observer -> {


            observer.update(title, description);

        });
    }

    public void setArooNew(String title, String description){
        this.title = title;
        this.description = description;
        System.out.println();
        System.out.println();
        System.out.println("==============Aroo New===============");

        showAroo();
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
