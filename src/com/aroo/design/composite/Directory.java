package com.aroo.design.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Node{

    List<Node> nodes = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    public Node addNode(Node node){
        nodes.add(node);
        return node;
    }

    public Node remove(Node node){
        nodes.remove(node);
        return node;
    }

    @Override
    public int getSize() {
        int size = 0;

        for(Node no : nodes){
            size += no.getSize();
        }
        return size;
    }

    @Override
    public void print() {
        for(Node no : nodes){
            if(no instanceof Directory)
                System.out.println(getName() + " Dir =" + no.getName());
            else
                System.out.println(getName() + " File = " + no.getName());
        }
    }
}
