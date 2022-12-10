package ru.mirea.practice.task3;

public class Number {

    private String number;

    public Number(String number) {

        this.number = "";
        int strLength = number.length();

        StringBuilder stringBuilder = new StringBuilder(this.number);

        if (number.startsWith("8")) {
            stringBuilder.append("+7");
        } else {
            stringBuilder.append(number, 0, strLength - 10);
        }

        stringBuilder.append(number, strLength - 10, strLength - 7);
        stringBuilder.append("-");

        stringBuilder.append(number, strLength - 7, strLength - 4);
        stringBuilder.append("-");

        stringBuilder.append(number.substring(strLength - 4));

        this.number = stringBuilder.toString();
    }

    @Override
    public String toString() {
        return "Number{ " + number + " }";
    }
}
