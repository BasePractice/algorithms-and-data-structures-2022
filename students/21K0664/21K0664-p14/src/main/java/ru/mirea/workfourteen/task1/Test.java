package ru.mirea.workfourteen.task1;

import java.util.StringTokenizer;

abstract class Test {
    public static void main(String[] args) {
        String toParse = "word1;word2;word3;word4";
        StringTokenizer st = new StringTokenizer(toParse, ";");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
