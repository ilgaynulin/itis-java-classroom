package com.company;

public class Main {

    public static void main(String[] args) {
        int i1 = 2, i2 = 4;
        if(i1 > i2) {
            System.out.println(i1 + " больше " + i2);
        }

        Human h1 = new Human("Ильяс", 26);
        Human h2 = new Human("Леголаз", 340);
        Human h3 = new Human("Кевин", 12);

        MyArrayList<Human> myArrayList = new MyArrayList();
        myArrayList.put(h1);
        myArrayList.put(h2);
        myArrayList.put(h3);

        myArrayList.printAll();

        System.out.println("Сортировка по возрастанию");

        myArrayList.sort(new HumanAgeToHighComparator());
        myArrayList.printAll();

        System.out.println("Сортировка по убыванию");
        myArrayList.sort(new HumanAgeToHighComparator().reversed());
        myArrayList.printAll();
    }
}
