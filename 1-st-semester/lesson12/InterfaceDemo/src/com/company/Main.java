package com.company;

public class Main {

    public static void main(String[] args) {
       Human human = new Human();
       Engineer engineer = new Engineer();


       click(human);
       click(engineer);
    }

    static void click(Speakable speakable) {
        speakable.speak();
    }
}
