package com.company;

public class Main {

    public static void main(String[] args) {
        Plastic plastic = new Plastic(10.0);
        Plastic plastic1 = new Plastic(40.0);
        Plastic plastic2 = new Plastic(50.0);
        Plastic plastic3 = new Plastic(70.0);
        Paper paper = new Paper(20.0);
        String str = "Oops";
        Trash t = new Trash(7.0);

        TrashCan<Trash> plasticTrashCan = new TrashCan<Trash>();
        plasticTrashCan.put(t);
//        plasticTrashCan.put(plastic);
//        plasticTrashCan.put(plastic1);
//        plasticTrashCan.put(plastic2);
//        plasticTrashCan.put(plastic3);

//        System.out.println(plasticTrashCan.getMass());

        // String не принимается т.к. параметр T ограничен по классу наследников Trash
        // TrashCan<String> stringTrashCan = new TrashCan<String>();

        RecycleTrashCan<Plastic, Paper> recycleTrashCan = new RecycleTrashCan<>();
    }
}
