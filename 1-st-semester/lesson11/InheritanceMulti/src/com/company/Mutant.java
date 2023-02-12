package com.company;

public class Mutant extends Human {
    protected String ability;

    public Mutant(String name, String ability) {
        // this.name = name;
        super(name);
        this.ability = ability;
    }

    public void useAbility() {
        System.out.println("У меня есть способность: " + ability);
    }
}
