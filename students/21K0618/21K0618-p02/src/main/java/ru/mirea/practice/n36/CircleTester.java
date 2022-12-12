package ru.mirea.practice.n36;

import java.util.InputMismatchException;
import java.util.Scanner;

abstract class CircleTester {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Введите 3 или 6 какую программу хотите оценить на работоспособность");
            int vibor = scan.nextInt();
            if (vibor == 3) {
                Point p = new Point(4, 4);

                Circle krug = new Circle(p, 10);

                Circle shar = new Circle(new Point(666, 667), 676);

                Circle okrug = new Circle(new Point(766, 767), 776);

                Circle sphera = new Circle(new Point(777, 777), 777);

                Circle[] krugi = new Circle[]{krug, shar, okrug, sphera};

                Tester36 test = new Tester36(krugi);
                System.out.println("Координаты точки p: " + p);
                System.out.println("Размер массива Krugi: " + test.getL());
                System.out.println("Массив Krugi: " + test);
            } else if (vibor == 6) {
                Point p = new Point(4, 4);

                Circle krug = new Circle(p, 10, "Синий");

                Circle shar = new Circle(new Point(666, 667), 676, "Белый");

                Circle ellips = new Circle(shar.getCenter(), krug.getRadius(), krug.getColour());

                System.out.println(krug + ", Длина: " + krug.length() + ", Площадь: " + krug.area());
                System.out.println(krug.equalss(shar));
                System.out.println(krug.equalss(ellips));


            }
        } catch (InputMismatchException e) {
            System.out.println("Error");
            scan.nextInt();
        } finally {
            scan.close();
        }
    }
}
