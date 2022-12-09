package ru.mirea.practice.task1;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringHandler {
    public String[] parsing(String str) {
        StringTokenizer parsingSettings = new StringTokenizer(str, ":., ");
        String[] parsedStrings = new String[parsingSettings.countTokens()];

        for (int i = 0; i < parsedStrings.length; i++) {
            if (parsingSettings.hasMoreTokens()) {
                parsedStrings[i] = parsingSettings.nextToken();
            }
        }
        System.out.println(Arrays.toString(parsedStrings));
        return parsedStrings;
    }
}
