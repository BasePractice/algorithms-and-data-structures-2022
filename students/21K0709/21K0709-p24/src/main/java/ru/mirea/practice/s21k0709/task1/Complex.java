package ru.mirea.practice.s21k0709.task1;

public class Complex {
    protected int real;
    protected int image;

    public Complex(int real, int image) {
        this.real = real;
        this.image = image;
    }

    public Complex() {
        real = 0;
        image = 0;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Complex{"
                +
                "real=" + real
                +
                ", image=" + image
                +
                '}';
    }
}
