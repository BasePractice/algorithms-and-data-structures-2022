package ru.mirea.practice.task2;

import java.util.Scanner;

public class TestCircle {
    public static Scanner sc = new Scanner(System.in);

    private Circle[] arr;

    private int num;

    public Circle min() {
        int min = (int) arr[0].getRadius();

        int j = -1;

        for (int i = 0; i < num; i++) {
            if ((int) arr[i].getRadius() <= min) {
                min = (int) arr[i].getRadius();
                j = i;
            }
        }

        return arr[j];
    }

    public Circle max() {
        int max = (int) arr[0].getRadius();

        int j = -1;

        for (int i = 0; i < num; i++) {
            if (arr[i].getRadius() >= max) {
                max = (int) arr[i].getRadius();
                j = i;
            }
        }

        return arr[j];
    }

    public void toSort() {
        circleSort(this.arr, 0, this.num - 1);
    }

    public static void circleSort(Circle[] source, int left, int right) {
        int delimiter = left + ((right - left) / 2) + 1;
        if (delimiter > 0 && right > (left + 1)) {
            circleSort(source, left, delimiter - 1);
            circleSort(source, delimiter, right);
        }
        Circle[] buffer = new Circle[right - left + 1];
        int cursor = left;
        for (int i = 0; i < buffer.length; i++) {
            if (delimiter > right || source[cursor].getRadius() <= source[delimiter].getRadius()) {
                buffer[i] = source[cursor];
                cursor++;
            } else {
                buffer[i] = source[delimiter];
                delimiter++;
            }
        }
        System.arraycopy(buffer, 0, source, left, buffer.length);
    }

    public TestCircle(int num) {
        Circle[] temp = new Circle[num];
        for (int i = 0; i < num; i++) {
            temp[i] = new Circle(Math.random() * 10);
        }
        this.arr = temp;
        this.num = num;
    }

    @Override
    public String toString() {
        String s = "ToString: ";

        for (int i = 0; i < arr.length; i++) {
            s += this.arr[i].toString() + "; ";
        }

        return s;
    }


    public static void main(String[] args) {
        TestCircle testCircle = new TestCircle(sc.nextInt());
        System.out.println(testCircle.toString());
        System.out.println("Max, Min: " + testCircle.max() + "        " + testCircle.min());
        for (Circle c : testCircle.arr) {
            System.out.println(c.getCenter().toString());
        }
        testCircle.toSort();
        System.out.println(testCircle.toString());
    }
}
