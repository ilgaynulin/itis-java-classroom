package com.company;

public class Main {

    public static void main(String[] args) {
        Human h = new Human("Ильяс", 26);
        Human h1 = new Human("Эван", 18);
        Human h2 = new Human("Джейн", 22);
        Human h3 = new Human("Иван", 23);
        Human h4 = new Human("Даша", 28);
        Human h5 = new Human("Люси", 30);

        Company<Human> company = new Company<>();
        company.put(h);
        company.put(h1);
        company.put(h2);
        company.put(h3);
        company.put(h4);
        company.put(h5);

        for(int i = 0; i < company.getSize(); i++) {
            Human humanByIndex = company.get(i);
            System.out.println(humanByIndex.getAge());
        }

        System.out.println();

        Company<String> strings = new Company<>();

        strings.put("Привет");
        strings.put("Как дела");

        for(int i = 0; i < strings.getSize(); i++) {
            System.out.println(strings.get(i).length());
        }
    }
}
