package ru.mirea.practice.work6;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

abstract class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        try {
            String read = scanner.nextLine();
            // String fileName = "C:\\Users\\ProPc\\IdeaProjects\\algorithm-forkedd\\students\\21K0673\\21K0673-p13\\
            // src\\main\\java\\ru.mirea.practice\\ru.mirea.practice.work6\\txt.txt";
            String string = "";
            try (FileReader reader = new FileReader(read)) {
                char[] chars = new char[256];
                int c;
                while ((c = reader.read(chars)) > 0) {
                    if (c < 256) {
                        chars = Arrays.copyOf(chars, c);
                    }
                    string = String.valueOf(chars);
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
            System.out.println(getLine(string));
        } catch (InputMismatchException e) {
            System.out.println("Error");
            scanner.nextInt();
        } finally {
            scanner.close();
        }
    }

    public static StringBuilder getLine(String string) {
        StringBuilder sb = new StringBuilder();
        int n = 0;
        int k = 0;
        String[] arr = new String[n];
        for (int i = 0; i < string.length() - 1; i++) {
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) == ' ') {
                    arr = add(arr);
                    if (i == 0) {
                        arr[k] = string.substring(i, j);
                    } else {
                        arr[k] = string.substring(i + 1, j);
                    }
                    k++;
                    i = j;
                }
            }
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].charAt(arr[i].length() - 1) == arr[j].charAt(0)) {
                    String buff = arr[i + 1];
                    arr[i + 1] = arr[j];
                    arr[j] = buff;
                }
            }
        }
        return sb.append(Arrays.toString(arr));
    }

    public static String[] add(String[] arr) {
        int i;
        String[] newarr = new String[arr.length + 1];
        for (i = 0; i < arr.length; i++) {
            newarr[i] = arr[i];
        }
        return newarr;
    }
}
