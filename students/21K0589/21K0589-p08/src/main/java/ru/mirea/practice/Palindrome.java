package ru.mirea.practice;

public final class Palindrome {
    private Palindrome() {}
    // 8

    public static String palindrome(String string, int lens) {
        if (string.length() == 1) {
            return string;
        }
        String temp = string.charAt(string.length() - 1) + palindrome(string.substring(0, string.length() - 1), lens);
        if (temp.length() != lens) {
            return temp;
        }
        if (temp.equals(string)) {
            return "Yes";
        }
        return "No";
    }

    public static void main(String[] args) {
        System.out.println(palindrome("дом", 3));
        System.out.println(palindrome("шалаш", 5));
    }
}
