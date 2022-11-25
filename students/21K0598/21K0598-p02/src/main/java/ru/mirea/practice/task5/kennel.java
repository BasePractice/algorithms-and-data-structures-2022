package ru.mirea.practice.task5;

import java.util.ArrayList;
import java.util.Scanner;

public class kennel {
    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<Dog>();
        try (Scanner sc = new Scanner(System.in)) {
            menu:
            System.out.println("Добро пожаловать!");
            command:
            while (true) {
                System.out.print("Выберите комманду" + '\n'
                        + "1: Показать список собак" + '\n'
                        + "2: Добавить собаку" + '\n'
                        + "3: Конвертировать возраст собаки в человеческий" + '\n'
                        + "Другой символ: выйти");
                switch (sc.nextInt()) {
                    case 1:
                        if (dogs.size() == 0) {
                            System.out.print("Нет собак в питомнике.");
                        }
                        else {
                            for (int i = 0; i < dogs.size(); i++) {
                                System.out.print("Собака №" + i+1 + '\n' + dogs.get(i).toString() + '\n');
                            }
                        }
                        continue command;
                    case 2:
                        System.out.print("Введите имя собаки: ");
                        String name = sc.next();
                        System.out.print("Введите возраст собаки");
                        int age = sc.nextInt();
                        dogs.add(new Dog(name, age));
                        continue command;
                    case 3:
                        System.out.print("Выберете номер собаки из списка: ");
                        int dogindex = sc.nextInt();
                        if (dogs.get(dogindex) == null) {
                            System.out.print("Не собаки с таким номером");
                            continue command;
                        } else {
                            System.out.print("Возраст собаки по человеческим меркам - " + dogs.get(dogindex).ConvertToHumanAge());
                        }
                        continue command;
                    default:
                        System.exit(0);
                }
            }
        }
    }
}