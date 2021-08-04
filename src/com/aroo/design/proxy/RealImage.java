package com.aroo.design.proxy;

public class RealImage implements IImageProxy {

    private String imageName;

    public RealImage(String imageName) {
        this.imageName = imageName;
        loadFromDisk(imageName);
    }

    private void loadFromDisk(String imageName) {
        System.out.println("Loading Image : " + imageName);
    }

    @Override
    public void showImage() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Show Image : " + imageName);
    }
}
