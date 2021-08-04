package com.aroo.design.proxy;

public class ProxyMain {
    public static void main(String[] args) {

        IImageProxy image1 = new ProxyImage("atti");
        IImageProxy image2 = new ProxyImage("aroo");

        image1.showImage();
        System.out.println();
        image2.showImage();
    }
}
