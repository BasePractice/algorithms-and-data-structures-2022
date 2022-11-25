package ru.mirea.practice.task4;

public class MathFunc implements MathCalculable {
    @Override
    public double pow(double number, int level) {
        return Math.pow(number, level);
    }

    @Override
    public double abs(double number) {
        return Math.abs(number);
    }

    @Override
    public double circlePerimeter(double radius) {
        return 2 * pi * radius;
    }
}
