package ru.mirea.practice.task5;

public class ThrowsDemo {
    public void getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in the details");
        }
        //code
    }
}
