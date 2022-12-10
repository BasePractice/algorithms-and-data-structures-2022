package ru.mirea.practice.task3;

/* Проверить, надежно ли составлен пароль. Пароль считается
надежным, если он состоит из 8 или более символов. Где символом может быть
цифр, английская буква, и знак подчеркивания. Пароль должен содержать хотя
бы одну заглавную букву, одну маленькую букву и одну цифру.
a) пример правильных выражений: F032_Password, TrySpy1.
b) пример неправильных выражений: smart_pass, A007. */

import java.util.regex.Pattern;

public abstract class PasswordChecker {
    public static boolean check(String str) {
        return Pattern.compile("(?=.*_)(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])\\w{8,}").matcher(str).find();
    }

    public static void main(String[] args) {

        System.out.println(PasswordChecker.check("sdhfhsafh"));
        System.out.println(PasswordChecker.check("AdfhsdfhA054_"));
        System.out.println(PasswordChecker.check("shdfjhsjd_112"));
        System.out.println(PasswordChecker.check("SDfdkfhhfh__"));
        System.out.println(PasswordChecker.check("ASfsdhfhas12323"));

    }
}
