package com.aroo.design;

import com.aroo.design.adapter.RSystemImpl;
import com.aroo.design.adapter.TSystem;
import com.aroo.design.adapter.ToyAdapter;
import com.aroo.design.singleton.Aroo;
import com.aroo.design.singleton.Atti;
import com.aroo.design.singleton.Toy;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        String a = null;
        Optional<String> b = Optional.of(a);
        System.out.println(b.toString());
    }
}


