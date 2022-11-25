package com.company;

public class Rectangle {
    private int a;
    private int b;


    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean equals(Object object) {
        if(this.getClass() != object.getClass()) {
            return false;
        }

        if(this.a == ((Rectangle) object).a && this.b == ((Rectangle) object).b
        || this.a == ((Rectangle) object).b && this.b == ((Rectangle) object).a) {
            return true;
        } else {
            return false;
        }
    }
}
