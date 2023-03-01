package com.company;

import java.util.Comparator;

public class HumanAgeToLowComparator implements Comparator<Human> {
    @Override
    public int compare(Human h1, Human h2) {
        return h2.getAge() - h1.getAge();
    }
}
