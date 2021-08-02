package com.aroo.design.singleton;

public class Toy {

    private static Toy toy = null;
    private static int cnt = 0;

    private Toy() {

    }

    public static Toy getInstance() {
        if (toy == null) {
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            toy = new Toy();
        }
        return toy;
    }

    public void showName(String clazz) {
        synchronized (this) {
            cnt++;
            System.out.println("atti aroo " + clazz + "  cnt = " + this.cnt);
        }
    }
}


//    public synchronized static Toy getInstance() {
//
//        if (toy == null) {
//
//            try {
//                Thread.sleep(2000);
//                toy = new Toy();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        return toy;
//    }
//
//    public void showName(String clazz) {
//        synchronized (this) {
//            cnt++;
//            System.out.println("atti aroo " + clazz + "  cnt = " + this.cnt);
//        }
//    }

//}
