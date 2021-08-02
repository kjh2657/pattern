package com.aroo.design.adapter;

public class ToyAdapter implements TSystem{

    private RSystem rSystem;

    public ToyAdapter(RSystem rSystem) {
        this.rSystem = rSystem;
    }

    @Override
    public void offBuy() {
        rSystem.buy();
    }

    @Override
    public void onBuy() {
        throw new UnsupportedOperationException("지원하지 않는 기능");
    }

    @Override
    public void logitics(String address) {
        rSystem.delivery(address);
    }

    @Override
    public void show() {
        rSystem.show();
    }
}
