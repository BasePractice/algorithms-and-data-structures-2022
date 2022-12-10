package ru.mirea.practice.s21k0647.punkt1;

import java.util.Scanner;

public final class InnCheck {
    private InnCheck() {

    }

    public static boolean checkInn(int inn, int[] data) throws InnNotValidException {
        int i = 0;
        while (inn != data[i]) {
            i++;
            if (i > 3) {
                throw new InnNotValidException(inn);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] data = {432134, 342123, 234123, 945123, 643457};

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Введите номер ИНН: ");
            try {
                int inn = sc.nextInt();
                checkInn(inn, data);
            } catch (InnNotValidException e) {
                System.err.println(e.getLocalizedMessage());
                System.exit(0);
            }
        }
        System.out.println("ИНН действителен!");
    }
}
