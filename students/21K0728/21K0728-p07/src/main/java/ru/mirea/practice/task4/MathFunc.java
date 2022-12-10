package ru.mirea.practice.task4;


public class MathFunc implements MathCalculable {

    @Override
    public double pow(double numb, int lvl) {
        return Math.pow(numb, lvl);
    }

    @Override
    public double abs(double r, double i) {
        return Math.sqrt(pow(r, 2) + pow(i, 2));
    }

    public double circumferenceLength(double rad) {
        return 2 * pi * rad;
    }
}
