package com.aroo.design.adapter;

public class TSystemImpl implements TSystem{
    @Override
    public void offBuy() {
        System.out.println("T Toy를 오프라인 구매하였습니다.");
    }

    @Override
    public void onBuy() {
        System.out.println("T Toy를 온라인 구매하였습니다.");
    }

    @Override
    public void logitics(String address) {
        System.out.println("T Toy를 " + address + "로 배송합니다.");
    }

    @Override
    public void show() {
        System.out.println("T Toy를 보여줍니다.");
    }
}
