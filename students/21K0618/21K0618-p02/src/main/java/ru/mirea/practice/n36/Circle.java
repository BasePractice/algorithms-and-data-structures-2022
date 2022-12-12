package ru.mirea.practice.n36;

class Circle {

    private Point center;
    private double radius;
    private String colour;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Circle(Point center, double radius, String colour) {
        this.center = center;
        this.radius = radius;
        this.colour = colour;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean equalss(Circle c) {
        return c.colour.equals(colour) && c.radius == radius;
    }

    public double length() {
        return 2.0 * Math.PI * this.radius;
    }

    public double area() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public String toString() {
        return "Круг: " + "Центр: " + center + ", Радиус r = " + radius + ", Цвет: '" + colour + '\'';
    }
}
