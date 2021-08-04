package com.aroo.design.proxy;

public class ProxyImage implements IImageProxy {

    private RealImage realImage;
    private String imageName;

    public ProxyImage(String imageName) {
        this.imageName = imageName;
    }

    @Override
    public void showImage() {

        long start = System.currentTimeMillis();
        long end = 0L;

        if(realImage == null)
            realImage = new RealImage(this.imageName);

        realImage.showImage();

        end = System.currentTimeMillis();

        long proceedTime = end - start;

        System.out.println("proceeding time : " + proceedTime);
    }
}
