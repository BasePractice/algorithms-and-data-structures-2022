package ru.mirea.workthirteen.task1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        //Задание 1
        System.out.println(str);

        //Задание 2
        char last = str.charAt(str.length() - 1);
        System.out.println("Последний символв строки:" + last);

        //Задание 3
        System.out.println(str.endsWith("!!!"));

        //Задание 4
        System.out.println(str.startsWith("I like"));

        //Задание 5
        System.out.println(str.contains("Java"));

        //Задание 6
        System.out.println("Индекс слова Java начинается с " + str.indexOf("Java"));

        //Задание 7
        System.out.println(str.replace('a', 'o'));

        //Задание 8
        System.out.println(str.toUpperCase());

        //Задание 9
        System.out.println(str.toLowerCase());

        //Задание 10
        System.out.println(str.substring(7, 11));

    }
}
