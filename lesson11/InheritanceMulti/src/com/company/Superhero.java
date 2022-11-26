package com.company;

public class Superhero extends Mutant {
    private int enemyCount;
    private String nickname;


    public Superhero(String name, String ability, int enemyCount, String nickname) {
        super(name, ability);
        this.enemyCount = enemyCount;
        this.nickname = nickname;
    }

    public void sayEnemyCount() {
        System.out.println(String.format("У меня %d врагов", enemyCount));
    }

    @Override
    public void sayHello() {
        System.out.println("Меня зовут " + nickname);
    }
}
