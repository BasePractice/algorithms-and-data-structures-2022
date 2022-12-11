package ru.mirea.practice.task5and6;

public class ProcessStrings implements StringFunc {
    private String str;

    public ProcessStrings(String str) {
        this.str = str;
    }

    @Override
    public int length() {
        return str.length();
    }

    @Override
    public String deleteEvenNumber() {
        StringBuilder strBuild = new StringBuilder();
        for (int i = 1; i < str.length(); i += 2) {
            char s = str.charAt(i);
            strBuild.append(s);
        }
        return strBuild.toString();
    }

    @Override
    public String reverse() {
        return new StringBuilder(str).reverse().toString();
    }
}
