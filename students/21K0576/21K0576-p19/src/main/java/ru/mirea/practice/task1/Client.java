package ru.mirea.practice.task1;

public class Client {
    String[] ItnDatabase = {
            "12345",
            "17171"
    };

    void requestNameAndItn(String s) {
        Boolean correct = false;
        for (String i : ItnDatabase) {
            if (i == s) {
                correct = true;
                break;
            }
        }
        if (!correct) {
            throw new IllegalArgumentException("ITN is incorrect.");
        }
        System.out.println("Found!");
    }

}
