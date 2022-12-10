package ru.mirea.practice.s21k0647.zad5;

public class NumberT {
    String number;
    String code;


    NumberT(String numberr) {
        number = "";
        StringBuilder stringBuilder = new StringBuilder(number);
        if (numberr.startsWith("8")) {
            code = "+<7>";
        } else {
            code = numberr.substring(0, numberr.length() - 10);
        }
        String operator = numberr.substring(numberr.length() - 10, numberr.length() - 7);
        String numbers3 = numberr.substring(numberr.length() - 7, numberr.length() - 4);
        String numbers4 = numberr.substring(numberr.length() - 4);
        stringBuilder.append(code);
        stringBuilder.append("<");
        stringBuilder.append(operator);
        stringBuilder.append(">-");
        stringBuilder.append(numbers3);
        stringBuilder.append("-<");
        stringBuilder.append(numbers4);
        stringBuilder.append(">");
        number = stringBuilder.toString();
    }

    @Override
    public String toString() {
        return "Number(" +  number + ')';
    }

    public static void main(String[] args) {
        NumberT number = new NumberT("89113615676");
        System.out.println(number);
    }
}
