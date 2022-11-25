package ru.mirea.worknine.task1;

import java.util.Arrays;

public class Test {

    private int n;

    private Student[] a;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public Student[] getA() {
        return a;
    }

    public void setA(Student[] a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Test{" + "n=" + n + ", a=" + Arrays.toString(a) + '}';
    }

    Test(int n) {
        this.n = n;
        this.a = new Student[n];
    }


    public void set(Student k, int n) {
        this.a[n] = k;
    }

    public void sort() {
        for (int left = 0; left < n; left++) {
            int value = this.a[left].idnumber;
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < this.a[i].idnumber) {
                    this.a[i + 1].idnumber = this.a[i].idnumber;
                } else {
                    break;
                }
            }
            this.a[i + 1].idnumber = value;
        }
    }

    public static void main(String[] args) {
        Student a = new Student("Ivan", 25, 99);
        Student b = new Student("Max", 15, 100);
        Student c = new Student("Anna", 24, 42);

        Test array = new Test(3);
        array.set(a, 0);
        array.set(b, 1);
        array.set(c, 2);

        System.out.println(array);

        array.sort();

        System.out.println(array);
    }
}