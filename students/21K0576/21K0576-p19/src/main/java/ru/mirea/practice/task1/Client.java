package ru.mirea.practice.task1;

public class Client {
    String[] itnDatabase = {
        "12345",
        "17171"
    };

    void requestNameAndItn(String s) {
        Boolean correct = false;
        for (String i : itnDatabase) {
            if (i.equals(s)) {
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
