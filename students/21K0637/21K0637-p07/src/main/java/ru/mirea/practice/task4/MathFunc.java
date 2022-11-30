package ru.mirea.practice.task4;

public class MathFunc implements MathCalculable {
    private double x;
    private double y;

    public MathFunc(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void pow(int level) {
        double newx = Math.pow(this.abs(), level) * Math.cos(level * Math.atan(y / x));
        double newy = Math.pow(this.abs(), level) * Math.sin(level * Math.atan(y / x));

        x = newx;
        y = newy;
    }

    @Override
    public double abs() {
        return Math.sqrt(x * x + y * y);
    }

    @Override
    public String toString() {
        return x + "+" + y + "i";
    }
}
