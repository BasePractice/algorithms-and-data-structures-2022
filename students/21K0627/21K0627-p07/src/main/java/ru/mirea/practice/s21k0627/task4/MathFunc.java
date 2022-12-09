package ru.mirea.practice.s21k0627.task4;

public class MathFunc implements MathCalculable {
    private double a;
    private double b;

    public MathFunc(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double absComplex() {
        return Math.sqrt(a * a + b * b);
    }

    @Override
    public void powComplex(int degree) {
        double newa = Math.pow(this.absComplex(), degree) * Math.cos(degree * Math.atan(b / a));
        double newb = Math.pow(this.absComplex(), degree) * Math.sin(degree * Math.atan(b / a));

        a = newa;
        b = newb;
    }

    @Override
    public double lengthCircle() {
        return this.absComplex() * 2 * PI; //вычисляет длину окружности с радиусом, равным модулю комплексного числа
    }

    @Override
    public String toString() {
        return a + " + " + b + "i; ";
    }
}
