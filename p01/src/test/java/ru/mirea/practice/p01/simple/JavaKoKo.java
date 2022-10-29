package ru.mirea.practice.p01.simple;

import java.util.StringTokenizer;


public final class JavaKoKo {
    private JavaKoKo() {}

    public static void main(String[] args) {
        StringTokenizer tokenizer = new StringTokenizer("", ";!, ");
        while (tokenizer.hasMoreElements()) {
            tokenizer.nextToken();
        }

    }
}
