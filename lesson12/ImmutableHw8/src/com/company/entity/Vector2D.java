package com.company.entity;

import java.util.Objects;

public class Vector2D {
    private final Point2D p;

    public Vector2D(Point2D p1, Point2D p2) {
        if(p1 == null || p2 == null) {
            throw new IllegalArgumentException("Одна из точек null");
        }
        this.p = new Point2D(p2.getX() - p1.getX(), p2.getY() - p1.getY());
    }

    public Vector2D(Point2D p) {
        if(p == null) {
            throw new IllegalArgumentException("Одна из точек null");
        }
        this.p = p;
    }

    public Vector2D(Vector2D vector2D) {
        if(vector2D == null) {
            throw new IllegalArgumentException("Вектор в аргументе конструктора null");
        }
        this.p = vector2D.p;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Vector2D vector2D = (Vector2D) o;
        return Objects.equals(p, vector2D.p);
    }

    @Override
    public String toString() {
        return String.format("Вектор: " + p);
    }

    public Vector2D add(Vector2D v) {
        return new Vector2D(new Point2D(p.getX() + v.p.getX(), p.getY() + v.p.getY()));
    }
}
