package ru.mirea.practice.task10;

import java.util.Scanner;

public abstract class HowMany {
    public static void main(String[] args) {
        Scanner sc = null;
        try {
            sc = new Scanner(System.in);
            System.out.println("Введите слова одной строкой через пробел");
            String input = sc.nextLine();

            int count = 0;

            //Если ввели хотя бы одно слово, тогда считать, иначе конец программы
            if (input.length() != 0) {
                count++;
                //Проверяем каждый символ, не пробел ли это
                for (int i = 0; i < input.length(); i++) {
                    if (input.charAt(i) == ' ') {
                        //Если пробел - увеличиваем количество слов на 1
                        count++;
                    }
                }
            }

            System.out.println("Вы ввели " + count + " слов");
            sc.close();
        } catch (IncompatibleClassChangeError e) {
            System.out.println("Error");
        } finally {
            sc.close();
        }
    }
}
