package com.company;

public class Main {

    public static void main(String[] args) {
        Human human = new Human();

        Knight knight = new Knight();

        Engineer engineer = new Engineer();

        Human[] humans = new Human[3];
        humans[0] = human;
        humans[1] = knight;
        humans[2] = engineer;

        clickHumans(humans);
    }

    static void clickHumans(Human[] humans) {
        for(Human h : humans) {
            h.sayHello();
        }
    }
}
