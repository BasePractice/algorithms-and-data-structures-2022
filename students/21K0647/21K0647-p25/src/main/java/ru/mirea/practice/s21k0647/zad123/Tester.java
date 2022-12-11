package ru.mirea.practice.s21k0647.zad123;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Tester {
    private Tester() {

    }

    public static boolean equ(String st) {
        return "abcdefghijklmnopqrstuv18340".equals(st);
    }

    public static void finder(String s) {
        Pattern p  = Pattern.compile("\\d+(\\.\\d+)?\\s?((USD)|(EUR)|(RUB))");
        Matcher m = p.matcher(s);
        while (m.find()) {
            System.out.println(m.group());
        }
    }

    public static void main(String[] args) {
        String toParse;
        System.out.println("Введите строку: ");
        try (Scanner sc = new Scanner(System.in)) {
            toParse = sc.nextLine();
            String del;
            System.out.println("Введите разделитель: ");
            del = new Scanner(System.in).nextLine();
            String []list = new String[toParse.length()];
            StringTokenizer st = new StringTokenizer(toParse, del);
            int i = 0;
            while (st.hasMoreTokens()) {
                list[i] = st.nextToken();
                System.out.println(list[i]);
                i++;
            }
        }

        String str1 = "abcdefghijklmnopqrstuv18340";
        String str2 = "Divide et impera";
        System.out.println(equ(str1));
        System.out.println(equ(str2));
        finder("13 EUR, 44 ERR, 0.004 EU, 14.88 RUB, abcd 284r42qr9 ");
    }
}
