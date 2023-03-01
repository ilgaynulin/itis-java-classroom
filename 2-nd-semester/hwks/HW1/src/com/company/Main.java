package com.company;

public class Main {

    public static void main(String[] args) {
        Human h = new Human("Ильяс", 26);
        Human h1 = new Human("Эван", 18);
        Human h2 = new Human("Джейн", 22);
        Human h3 = new Human("Иван", 23);
//        Human h4 = new Human("Даша", 28);
//        Human h5 = new Human("Люси", 30);

        MyArrayList<Human> myArrayList = new MyArrayList<>();
        myArrayList.put(h);
        myArrayList.put(h1);
        myArrayList.put(h2);

        myArrayList.printAll();

        System.out.println("Добавляем элемент в начало");
        myArrayList.putFirst(h3);

        myArrayList.printAll();

        System.out.println("Удаляем второй элемент");
        myArrayList.delete(1);

        myArrayList.printAll();
//        myArrayList.put(h3);
//        myArrayList.put(h4);
//        myArrayList.put(h5);

//        for(int i = 0; i < myArrayList.getSize(); i++) {
//            Human humanByIndex = myArrayList.get(i);
//            System.out.println(humanByIndex.getAge());
//        }

//        System.out.println();
//
//        MyArrayList<String> strings = new MyArrayList<>();
//
//        strings.put("Привет");
//        strings.put("Как дела");
//
//        for(int i = 0; i < strings.getSize(); i++) {
//            System.out.println(strings.get(i).length());
//        }
    }
}
