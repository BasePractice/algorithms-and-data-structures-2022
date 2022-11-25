package ru.mirea.practice.task13;

public abstract class Tester {
    public static void main(String[] args) {
        UserStringBuilder stringBuilder = new UserStringBuilder();
        stringBuilder.append("hello ");
        stringBuilder.append("world");
        stringBuilder.reverse();
        stringBuilder.reverse();
        stringBuilder.delete(0, 3);
        stringBuilder.insert(1, "2324");
    }
}
