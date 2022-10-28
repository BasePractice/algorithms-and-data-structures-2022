package ru.mirea.practice.work5;

public class TelephoneNumber {
    private String number;

    TelephoneNumber(String string) {
        this.number = string;
    }

    @Override
    public String toString() {
        if (number.startsWith("8")) {
            return "+7-" + number.substring(1, 4) + "-" + number.substring(4, 7) + "-" + number.substring(7, 11);
        } else {
            return number.substring(0, 2) + "-" + number.substring(2, 5) + "-" + number.substring(5, 8) + "-"
                    + number.substring(8, 11);
        }
    }
}
