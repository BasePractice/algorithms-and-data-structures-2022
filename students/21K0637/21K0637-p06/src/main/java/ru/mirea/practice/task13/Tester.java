package ru.mirea.practice.task13;

public abstract class Tester {
    public static void main(String[] args) {
        StringBuilderPublisher stringBuilderPublisher = new StringBuilderPublisher();
        stringBuilderPublisher.setListener(stringBuilderPublisher1
            -> System.out.println("CHANGE: " + stringBuilderPublisher1.toString()));

        stringBuilderPublisher.append("I love !");
        stringBuilderPublisher.insert(7, "Java");
        stringBuilderPublisher.replace(7, stringBuilderPublisher.length(), "MIREA");
        stringBuilderPublisher.reverse();
    }
}
