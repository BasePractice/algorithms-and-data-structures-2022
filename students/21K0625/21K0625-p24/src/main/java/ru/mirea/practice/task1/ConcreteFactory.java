package ru.mirea.practice.task1;

public class ConcreteFactory implements ComplexAbstractFactory {
    private double x;
    private double y;

    ConcreteFactory(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public Complex createComplex() {
        return new Complex(x, y);
    }

    public Complex createComplex(int real, int image) {
        return new Complex(real, image);
    }
}