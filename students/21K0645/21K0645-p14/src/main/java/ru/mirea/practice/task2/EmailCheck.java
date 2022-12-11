package ru.mirea.practice.task2;

/* Написать регулярное выражение, определяющее является ли данная
строчка допустимым (корректным) е-mail адресом согласно RFC под номером
2822.
a) пример правильных выражений: user@example.com, root@localhost
b) пример неправильных выражений: myhost@@@com.ru, @my.ru,
Julia String */

import java.util.regex.Pattern;

public final class EmailCheck {

    private EmailCheck() {
    }

    public static boolean check(String str) {
        return Pattern.compile("^((\\w+)|(\".+\")|([^a-zA-Z\\d_@]+))@\\w+.\\w+$").matcher(str).find();
    }

    public static void main(String[] args) {

        System.out.println(check("user@example.com"));
        System.out.println(check("myhost@@@com.ru"));
        System.out.println(check("root@localhost"));
        System.out.println(check("@my.ru"));

    }
}
