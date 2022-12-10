package ru.mirea.practice.task1;

/* 1. Напишите метод, который принимает в качестве параметра любую
строку, например “I like Java!!!”.
2. Распечатать последний символ строки. Используем метод
String.charAt().
3. Проверить, заканчивается ли ваша строка подстрокой “!!!”.
Используем метод String.endsWith().
4. Проверить, начинается ли ваша строка подстрокой “I like”.
Используем метод String.startsWith().
5. Проверить, содержит ли ваша строка подстроку “Java”. Используем
метод String.contains().
6. Найти позицию подстроки “Java” в строке “I like Java!!!”.
7. Заменить все символы “а” на “о”.
8. Преобразуйте строку к верхнему регистру.
9. Преобразуйте строку к нижнему регистру.
10. Вырезать строку Java c помощью метода String.substring(). */

import java.util.Locale;

public final class Task1 {

    private Task1() {
    }

    private static String str;

    public static void inputStr(String string) {
        str = string;
    }

    public static void lastChar() {
        System.out.println(str.charAt(str.length() - 1));
    }

    public static boolean endsByExclamationMarks() {
        return str.endsWith("!!!");
    }

    public static boolean startsWithIlike() {
        return str.startsWith("I like");
    }

    public static boolean containSubStr(String string) {
        return str.contains(string);
    }

    public static int findSub(String substring) {
        return str.indexOf(substring);
    }

    public static void replaceChars(char ch) {
        str = str.replace('a', ch);
    }

    public static void toUpper() {
        str = str.toUpperCase(Locale.ROOT);
    }

    public static void toLower() {
        str = str.toLowerCase(Locale.ROOT);
    }

    public static String subStr(String string) {
        if (str.contains(string)) {
            int index = string.indexOf(str);
            return string.substring(index);
        }
        return string + " is not in " + str;
    }

    public static void main(String[] args) {

        inputStr("I like Java!!!");

        lastChar();

        System.out.println("Ends with !!! : " + endsByExclamationMarks());
        System.out.println("Starts with I like : " + startsWithIlike());

        System.out.println("Contains substring 'Java' : " + containSubStr("Java"));
        System.out.println("SubStr Java at : " + findSub("Java"));

        System.out.println(str);

        replaceChars('o');
        System.out.println(str);

        toUpper();
        System.out.println(str);

        toLower();
        System.out.println(str);

        System.out.println(subStr("Java"));
        System.out.println();
    }
}
