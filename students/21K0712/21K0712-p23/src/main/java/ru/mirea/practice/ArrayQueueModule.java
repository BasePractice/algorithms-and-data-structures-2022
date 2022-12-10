package ru.mirea.practice;

public class ArrayQueueModule {
    int element;

    ArrayQueueModule(ArrayQueue q, int i) {

        element = q.getElement(i);
    }

    public int getElement() {

        return element;
    }
}
