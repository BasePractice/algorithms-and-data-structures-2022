package ru.mirea.practice.n1to3;

public class ArrayQueueModule {
    int element;

    ArrayQueueModule(ArrayQueue q, int i) {

        element = q.getElement(i);
    }

    public int getElement() {

        return element;
    }
}
