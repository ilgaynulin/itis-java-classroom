package com.company;

public class Main {

    public static void main(String[] args) {
        MyArrayList<Integer> integers = new MyArrayList<>();
        integers.put(1);
        integers.put(2);
        integers.put(3);
        System.out.println("Выведем на экран исходные объекты");
        integers.printAll();

        System.out.println("Выполним преобразование");
        integers.apply(n -> n * 3);

        System.out.println("Выведем на экран элементы после преобразования");
        integers.printAll();


        MyArrayList<String> strings = new MyArrayList<>();
        strings.put("Елена");
        strings.put("Вася");

        System.out.println("До преобразования");
        strings.printAll();
        System.out.println("После преобразования");
        strings.apply(n -> n.concat(" программист"));
        strings.printAll();
    }
}
