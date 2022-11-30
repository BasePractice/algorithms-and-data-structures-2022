package ru.mirea.practice.solutiontask3;

import java.util.Scanner;

public class Tester {
    private final Circle[] mass;
    private final int sizeM;

    public Tester(int sizem, Circle[] mass) {
        this.sizeM = sizem;
        this.mass = mass;
    }

    @Override
    public String toString() {
        String aboutmass = "";
        for (int i = 0; i < this.sizeM; i++) {
            aboutmass += "------" + (i + 1) + "------\n" + this.mass[i].toString() + "\n-------------\n";
        }
        return aboutmass;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите кол-во окружностей в массиве");
            int temp = sc.nextInt();
            Circle[] mass = new Circle[temp];

            for (int i = 0; i < temp; i++) {
                System.out.println("Введите центр окружности");
                Point temppoint = new Point(sc.nextDouble(), sc.nextDouble());
                System.out.println("Введите радиус");
                Circle tempcircle = new Circle(temppoint, sc.nextInt());
                mass[i] = tempcircle;
            }
            Tester object = new Tester(temp, mass);
            System.out.println(object);
        }
    }
}
