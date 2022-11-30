package ru.mirea.practice.work3;

public enum Shop {
    Mihail("LOGIN"), _1234("PASSWORD");
    private final String a;

    Shop(String a) {
        this.a = a;
    }

    public String getA() {
        return a;
    }
}
