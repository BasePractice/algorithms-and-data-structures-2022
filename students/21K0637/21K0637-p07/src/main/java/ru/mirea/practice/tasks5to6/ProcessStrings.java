package ru.mirea.practice.tasks5to6;

public class ProcessStrings implements Stringable {
    private String string;

    public ProcessStrings(String string) {
        this.string = string;
    }

    @Override
    public int length() {
        return string.length();
    }

    @Override
    public String substring() {
        StringBuilder strResult = new StringBuilder();
        for (int i = 0; i < string.length(); i += 2) {
            strResult.append(string.charAt(i));
        }
        return strResult.toString();
    }

    @Override
    public String reverse() {
        return new StringBuilder(string).reverse().toString();
    }
}
