package com.company;

import java.util.Comparator;
import java.util.Date;

public class Human implements Comparable<Human>{
    private String name;
    private Category category;

    public Human(String name) {
        this.name = name;
        this.category = Category.ORDINARY;
    }

    public void callMeWithTry() throws MyCheckedException {

        return;
    }

    public Human(String name, Category category) {
        this.name = name;
        this.category = category;
    }

    public static Comparator<Human> getComparatorByCategory() {
        return new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                return o2.category.getPriority() - o1.category.getPriority();
            }
        };
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Human o) {
        return o.category.getPriority() - this.category.getPriority();
    }
}
