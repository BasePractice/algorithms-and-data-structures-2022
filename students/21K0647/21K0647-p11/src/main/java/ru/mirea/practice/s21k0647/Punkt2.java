package ru.mirea.practice.s21k0647;

import java.util.Date;

public final class Punkt2 {
    private Punkt2() {

    }

    public static void main(String[] args) {
        Date neue = new Date();
        Date s = new Date();
        Date pols = new Date(2003, 1, 30, 8, 32, 17);
        int result = neue.compareTo(pols);
        int result1 = s.compareTo(neue);

        sravn(result);
        sravn(result1);
    }

    public static void sravn(int result) {
        if (result == 0) {
            System.out.println("Даты равны");
        } else if (result < 0) {
            System.out.println("Введенная дата меньше системного времени");
        } else {
            System.out.println("Введенная дата больше системного времени");
        }
    }
}
