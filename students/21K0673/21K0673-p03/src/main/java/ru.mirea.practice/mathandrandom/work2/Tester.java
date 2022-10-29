package ru.mirea.practice.mathandrandom.work2;

public class Tester {
    private final int a;
    private final Circle[] arr;

    Tester(int a) {
        this.a = a;
        this.arr = new Circle[a];
    }

    public void setCircle(Circle k, int z) {
        this.arr[z] = k;
    }

    public Circle getBig() {
        for (int i = 0; i < this.a - 1; ) {
            for (int j = 1; j < this.a; j++) {
                if (this.arr[i].getR() < this.arr[j].getR()) {
                    i = j;
                }
            }
            // DUPLICATE: 21K0664
            // FIXME: Что за логика?
            // return this.arr[i];
        }
        return this.arr[0];
    }

    public Circle getSmall() {
        for (int i = 0; i < this.a - 1; ) {
            for (int j = 1; j < this.a; j++) {
                if (this.arr[i].getR() > this.arr[j].getR()) {
                    i = j;
                }
            }
            // DUPLICATE: 21K0664
            // FIXME: Что за логика?
            // return this.arr[i];
        }
        return this.arr[0];
    }

    public void sort() {
        for (int i = 0; i < this.a - 1; i++) {
            for (int j = 1; j < this.a; j++) {
                if (this.arr[i].getR() > this.arr[j].getR()) {
                    Circle buff = this.arr[j];
                    this.arr[j] = this.arr[i];
                    this.arr[i] = buff;
                }
            }
        }
    }

    public String toString() {
        System.out.println("\n");
        for (int i = 0; i < this.a; i++) {
            System.out.println("{" + this.arr[i].toString() + "}");
        }
        return " ";
    }

    public static void main(String[] args) {
        Point p = new Point(35, 24);
        Circle a = new Circle(p, Math.random());
        Circle b = new Circle(p, Math.random());
        Circle c = new Circle(p, Math.random());

        Tester ar = new Tester(3);
        ar.setCircle(a, 0);
        ar.setCircle(b, 1);
        ar.setCircle(c, 2);

        System.out.println(ar.getBig());
        System.out.println(ar.getSmall());

        ar.sort();

        System.out.println(ar.toString());
    }
}
