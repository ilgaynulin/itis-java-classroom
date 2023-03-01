package com.company;

import java.util.Comparator;

public class HumanAgeToHighComparator implements Comparator<Human> {
    @Override
    public int compare(Human h1, Human h2) {
        return h1.getAge() - h2.getAge();
    }
}
