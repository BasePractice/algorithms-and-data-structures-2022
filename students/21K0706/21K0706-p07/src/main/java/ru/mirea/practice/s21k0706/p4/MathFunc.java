package ru.mirea.practice.s21k0706.p4;

import static java.lang.Math.pow;

public class MathFunc implements MathCalculable {


    @Override
    public double exponentiation(double n, double a) {
        return pow(5, 3);
    }

    @Override
    public double moduleComplex(double re, double im) {
        return pow(re * re + im * im, 0.5);
    }

    public double aria(double r) {
        return 2 * PI * r;
    }

    public static void main(String[] args) {
        MathCalculable mc1 = new MathFunc();
        MathFunc mc2 = new MathFunc();
        System.out.println(mc1.exponentiation(9, 6));
        System.out.println(mc1.moduleComplex(7, 2));
        System.out.println(mc2.aria(10));

    }
}
