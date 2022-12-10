package ru.mirea.practice.task5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Tester {
    public static void main(String[] args) {
        System.out.println("24/04/2001 " + check("24/04/2001"));
        System.out.println("28/07/2003 " + check("28/07/2003"));
        System.out.println("01/02/1912 " + check("01/02/1912"));
        System.out.println("02-12-1966 " + check("02-12-1966"));
    }

    public static boolean check(String str) {
        Pattern pat = Pattern.compile("[1-3]\\d/((1[0-2])|(0[1-9]))/((19\\d{2})|([2-9]\\d{3}))");
        Matcher match = pat.matcher(str);
        return match.matches();
    }
}
