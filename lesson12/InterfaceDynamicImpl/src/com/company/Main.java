package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Создаём работника");
	    Employee em = new Employee("Ильяс");
        Position pos = new PositionFromConsole();
        Position randPos = new PositionFromStorage();
        System.out.println("Выдаём ему должность");
        em.setPosition(new PositionFromConsole());

        System.out.println(em);
    }
}
