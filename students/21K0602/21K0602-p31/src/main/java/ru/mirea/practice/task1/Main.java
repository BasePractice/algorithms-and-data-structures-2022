package ru.mirea.practice.task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public abstract class Main {
    public static void main(String[] args) {
        TwoThreeTree tree = new TwoThreeTree();
        String fileName = "students/21K0602/21K0602-p31/src/"
                + "main/java/ru/mirea/practice/task1/PROCS.txt";

        String line = null;
        try(FileReader fileReader = new FileReader(fileName)) {
            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                String string = "";
                while ((line = bufferedReader.readLine()) != null) {
                    string = line.split(",")[0];
                    tree.insert(Integer.valueOf(string));

                }
            }

        } catch (IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");
        }

    }
}
