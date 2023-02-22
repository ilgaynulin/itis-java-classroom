package com.company;

public class Main {

    public static void main(String[] args) {
        MyLinkedList<String> strings = new MyLinkedList<>();
        strings.add("Kill");
        strings.add("Link");
        strings.put("Zelda", 0);

        System.out.println(strings.get(0));
        System.out.println(strings.get(1));
        System.out.println(strings.get(2));
//        System.out.println(strings.get(3));
    }
}
