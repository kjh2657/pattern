package com.aroo.design.composite;

public class CompositeMain {
    public static void main(String[] args) {

        TextFile aroo = new TextFile("aroo", 10);
        TextFile atti = new TextFile("atti", 20);

        XmlFile xmlFile = new XmlFile("xml", 5);

        Directory mainDir = new Directory("main");
        Directory subDir = new Directory("subDir");
        Directory susubDir = new Directory("susubDir");
        Directory sub2Dir = new Directory("sub2Dir");

        mainDir.addNode(subDir);
        mainDir.addNode(aroo);
        mainDir.addNode(sub2Dir);

        subDir.addNode(atti);
        subDir.addNode(susubDir);

        sub2Dir.addNode(xmlFile);

        susubDir.addNode(atti);
        susubDir.addNode(aroo);

        int size = mainDir.getSize();
        System.out.println("size = " + size);

        mainDir.print();
        subDir.print();
        sub2Dir.print();
        susubDir.print();
    }
}
