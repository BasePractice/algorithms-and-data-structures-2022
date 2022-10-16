package ru.mirea.practice.Work_10;

import java.util.Arrays;
import java.util.Scanner;

public class How_Many {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine())
        {
            String[] tokens = scanner.nextLine().split("\\s");
            System.out.println(Arrays.toString(tokens)+"\n"+tokens.length+" words");
        }

        scanner.close();
    }
}
