package ru.mirea.practice.s21k0709.task2to3;

public class Node<T> {
    public Node nextElem;
    public T data;

    public Node(T data) {
        nextElem = null;
        this.data = data;
    }
}