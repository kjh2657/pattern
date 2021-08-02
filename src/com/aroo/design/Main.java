package com.aroo.design;

import com.aroo.design.adapter.RSystemImpl;
import com.aroo.design.adapter.TSystem;
import com.aroo.design.adapter.ToyAdapter;
import com.aroo.design.singleton.Aroo;
import com.aroo.design.singleton.Atti;
import com.aroo.design.singleton.Toy;

public class Main {

    public static void main(String[] args) {

        TSystem tSystem = new ToyAdapter(new RSystemImpl());
        tSystem.offBuy();

        tSystem.logitics("swon");
        tSystem.show();

        try {
            tSystem.onBuy();
        } catch (UnsupportedOperationException e){
            System.out.println("Not Supported");
        }
    }
}


