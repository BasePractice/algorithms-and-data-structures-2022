package ru.mirea.practice.task5to6;

public class StringWorker implements ProcessString {

    private String str;

    public StringWorker() {
        str = "";
    }

    public StringWorker(String str) {
        this.str = str;
    }

    @Override
    public int length() {
        return str.length();
    }

    @Override
    public String reverse() {
        return new StringBuilder(str).reverse().toString();
    }

    @Override
    public String oddCharacters() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < str.length(); i += 2) {
            stringBuilder.append(str.charAt(i));

        }
        return stringBuilder.toString();
    }
}
