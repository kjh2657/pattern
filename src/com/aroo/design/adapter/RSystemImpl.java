package com.aroo.design.adapter;

public class RSystemImpl implements RSystem{
    @Override
    public void buy() {
        System.out.println("R Toy를 구매하였습니다.");
    }

    @Override
    public void delivery(String address) {
        System.out.println("R Toy를 " + address + "로 배송합니다.");
    }

    @Override
    public void show() {
        System.out.println("R Toy를 보여줍니다.");
    }
}
