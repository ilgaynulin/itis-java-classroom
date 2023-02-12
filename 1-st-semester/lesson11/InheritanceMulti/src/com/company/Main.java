package com.company;

public class Main {

    public static void main(String[] args) {
//        Human human = new Human("Брюс Беннер");
//        human.sayHello();

//        Mutant mutant = new Mutant("Брюс Беннер", "Ярость");
//
//        System.out.println(mutant.getName());
//        mutant.sayHello();
//        mutant.useAbility();

        Superhero superhero = new Superhero("Брюс Беннер", "Ярость", 5, "Халк");
        superhero.sayHello();
        superhero.sayEnemyCount();
    }
}
