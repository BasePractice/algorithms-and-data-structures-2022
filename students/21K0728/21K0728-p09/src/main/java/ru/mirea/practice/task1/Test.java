package ru.mirea.practice.task1;

import java.util.Arrays;

public class Test {

    private int num;

    private Student[] a;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Student[] getA() {
        return a;
    }

    public void setA(Student[] a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Test{" + "num is " + num + ", a=" + Arrays.toString(a) + '}';
    }

    Test(int num) {
        this.num = num;
        this.a = new Student[num];
    }


    public void set(Student k, int n) {
        this.a[n] = k;
    }

    public void sort() {
        for (int left = 0; left < num; left++) {
            int value = this.a[left].idNumber;
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < this.a[i].idNumber) {
                    this.a[i + 1].idNumber = this.a[i].idNumber;
                } else {
                    break;
                }
            }
            this.a[i + 1].idNumber = value;
        }
    }

    public static void main(String[] args) {
        Student a = new Student("Kurt", 54);
        Student b = new Student("Donald", 357);
        Student c = new Student("Winona", 12);

        Test array = new Test(3);
        array.set(a, 0);
        array.set(b, 1);
        array.set(c, 2);

        System.out.println(array);

        array.sort();

        System.out.println(array);
    }
}