package com.aroo.design.observer;

public interface Publisher {
    void subscribe(Observer observer);
    void desubscribe(Observer observer);
    void showAroo();
}
