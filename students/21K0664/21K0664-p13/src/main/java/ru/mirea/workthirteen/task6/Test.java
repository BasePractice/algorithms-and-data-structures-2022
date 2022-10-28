package ru.mirea.workthirteen.task6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;
import java.util.List;

public abstract class Test {
    public static StringBuilder getLine(String... words) {

        StringBuilder result = new StringBuilder();
        if (words == null || words.length == 0) {
            return result;
        }
        if (words.length == 1 || "".equals(words[0])) {
            return result.append(words[0]);
        }

        List<String> wordsList = new ArrayList<>(Arrays.asList(words));
        while (wordsList.remove("")) {
            wordsList.remove("");
        }
        while (isYes(wordsList)) {
            Collections.shuffle(wordsList);
        }
        for (String word : wordsList) {
            result.append(word).append(" ");
        }
        result.deleteCharAt(result.length() - 1);
        return result;
    }

    public static boolean isYes(List<String> wordsList) {
        for (int i = 0; i < wordsList.size() - 1; i++) {
            String firstWord = wordsList.get(i).toLowerCase(Locale.ENGLISH);
            String secondWord = wordsList.get(i + 1).toLowerCase(Locale.ENGLISH);
            if (firstWord.charAt(firstWord.length() - 1) != secondWord.charAt(0)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader b = null;
        String[] text = new String[0];
        File file = new File("txt.txt");
        PrintWriter a = new PrintWriter(file);
        try {

            file.createNewFile();
            a.println("Киев Нью-Йорк Амстердам Вена Мельбурн");
            a.close();

            b = new BufferedReader(new FileReader("txt.txt"));
            String str;
            while ((str = b.readLine()) != null) {
                String[] newWords = str.split(" ");
                String[] result = new String[text.length + newWords.length];
                System.arraycopy(text, 0, result, 0, text.length);
                System.arraycopy(newWords, 0, result, text.length, newWords.length);
                text = result;
                System.out.print("\n");
                for (String s : text) {
                    System.out.print(s + " ");
                }
                StringBuilder results = getLine(text);
                System.out.println("\n\n" + results.toString());
            }


        } catch (IOException e) {
            System.out.println("Error " + e);
        } finally {
            assert b != null;
            b.close();
            a.close();
        }
    }
}


