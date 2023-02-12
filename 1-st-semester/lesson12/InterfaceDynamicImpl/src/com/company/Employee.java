package com.company;

public class Employee {
    private String name;
    private String position;

    public Employee(String name) {
        this.name = name;
    }

    public void setPosition(Position position) {
        this.position = position.givePosition();
    }

    public String toString() {
        return String.format("Работник " + this.name + " с должностью " + this.position);
    }
}
