package ru.mirea.practice.task5;

import java.util.ArrayList;
import java.util.Scanner;

public class kennel {
    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<Dog>();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Добро пожаловать!");
            command:
            while (true) {
                System.out.print("Выберите комманду" + '\n'
                        + "1: Показать список собак" + '\n'
                        + "2: Добавить собаку" + '\n'
                        + "3: Конвертировать возраст собаки в человеческий" + '\n'
                        + "Другое число - выйти" + '\n');
                switch (sc.nextInt()) {
                    case 1:
                        if (dogs.size() == 0) {
                            System.out.print("Нет собак в питомнике.");
                        }
                        else {
                            for (int i = 0; i < dogs.size(); i++) {
                                System.out.print("Собака №" + (i+1) + '\n' + " Имя: " + dogs.get(i).getName() + '\n' + "возраст: " + dogs.get(i).getAge() + '\n');
                            }
                        }
                        continue command;
                    case 2:
                        System.out.print("Введите имя собаки: ");
                        String name = sc.next();
                        System.out.print("Введите возраст собаки: ");
                        int age = sc.nextInt();
                        dogs.add(new Dog(name, age));
                        continue command;
                    case 3:
                        System.out.print("Выберете номер собаки из списка: ");
                        int dogindex = sc.nextInt() - 1;
                        if (dogs.get(dogindex) == null) {
                            System.out.print("Не собаки с таким номером");
                            continue command;
                        } else {
                            System.out.print("Возраст собаки с именем " + dogs.get(dogindex).getName() + " по человеческим меркам - " + dogs.get(dogindex).ConvertToHumanAge() + '\n');
                        }
                        continue command;
                    default:
                        System.out.println("Будем рады видеть вас снова");
                        System.exit(0);
                }
            }
        }
    }
}