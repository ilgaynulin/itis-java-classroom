package com.company;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        Box<String> strings = new Box<>();

        strings.put("one");
        strings.put("two");
        strings.put(null);
        strings.put("three");

        Iterator<String> iterator = strings.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("IteratorNoneNull:");
        Iterator<String> iteratorNoneNull = strings.iteratorNoneNull();
        while(iteratorNoneNull.hasNext()) {
            System.out.println(iteratorNoneNull.next());
        }
//        String str = iterator.next();
    }
}
