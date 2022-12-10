package com.company.nested;

public class PointDistanceCalculator {

    private static class Point {
        private double x;
        private double y;

        Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }
    }

    /**
     * Вычисляет расстояние между двумя точками
     * @return расстояние между точками
     */
    public static double calculateDistanceBetweenPoints(double x1, double y1, double x2, double y2) {
        Point p1 = new Point(x1, x2);
        Point p2 = new Point(x2, y2);

        return calculateDistanceBetweenPoints(p1, p2);
    }


    private static double calculateDistanceBetweenPoints(Point p1, Point p2) {
        return Math.sqrt((p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y - p1.y));
    }
}
