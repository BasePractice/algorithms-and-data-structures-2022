package ru.mirea.practice.task12;

public abstract class Tester {
    public static void main(String[] args) {
        UndoStringBuilder stringBuilder = new UndoStringBuilder();
        stringBuilder.append("hello");

        stringBuilder.append("hi");
        System.out.println(stringBuilder.toString());
        stringBuilder.undo();
        System.out.println(stringBuilder.toString());
        stringBuilder.insert(1, "fff");
        System.out.println(stringBuilder.toString());
        stringBuilder.undo();
        System.out.println(stringBuilder.toString());
        stringBuilder.replace(0, 3, "fff");
        System.out.println(stringBuilder.toString());
        stringBuilder.undo();
        System.out.println(stringBuilder.toString());
        stringBuilder.delete(2, 3);
        System.out.println(stringBuilder.toString());
        stringBuilder.undo();
        System.out.println(stringBuilder.toString());
        stringBuilder.reverse();
        System.out.println(stringBuilder.toString());
        stringBuilder.undo();
        System.out.println(stringBuilder.toString());
    }
}
