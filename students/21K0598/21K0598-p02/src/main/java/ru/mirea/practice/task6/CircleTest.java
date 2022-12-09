package ru.mirea.practice.task6;

import java.util.Scanner;

abstract class CircleTest {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Введите радиус окружности: ");
            double rad = sc.nextDouble();
            double radTwo = 0.0;
            Circle one = new Circle(rad);
            Circle two = new Circle(radTwo);
            while (true) {
                System.out.print("Выберите каомманду:" + '\n'
                                 + "1: Ввести радиус второй окружности" + '\n'
                                 + "2: Изменить радиус первой окружности" + '\n'
                                 + "3: Найти периметр окружности" + '\n'
                                 + "4: Найти площадь круга" + '\n'
                                 + "5: Сравнить окружности" + '\n'
                                 + "6-0: Выйти" + '\n');
                switch (sc.nextInt()) {
                    case 1:
                        System.out.print("Введите радиус для второй окружности: ");
                        radTwo = sc.nextDouble();
                        two.setRad(radTwo);
                        break;
                    case 2:
                        System.out.print("Введите радиус окружности: ");
                        rad = sc.nextDouble();
                        one.setRad(rad);
                        break;
                    case 3:
                        System.out.print("Периметр окружности равен " + one.perimeter());
                        break;
                    case 4:
                        System.out.print("лощадь круга равна " + one.circleSquare());
                        break;
                    case 5:
                        if (rad < radTwo) {
                            System.out.println("Вторая окружность юольше первой.");
                        } else if (rad > radTwo) {
                            System.out.println("Первая окружность больше второй.");
                        } else {
                            System.out.println("Окружности равны.");
                        }
                        break;
                    default:
                        System.exit(0);
                        break;
                }
            }
        }
    }
}
