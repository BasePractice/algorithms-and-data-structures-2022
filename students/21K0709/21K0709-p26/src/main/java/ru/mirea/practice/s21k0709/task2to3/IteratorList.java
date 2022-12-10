package ru.mirea.practice.s21k0709.task2to3;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class IteratorList<T> implements Iterable<T> {
    private int size;
    private Node head;

    public IteratorList() {
        size = 0;
        head = null;
    }

    public void add(T elem) throws NullPointerException {
        if (elem == null) {
            throw new NullPointerException("Элемент для добавления недействителен");

        }
        Node node = new Node<>(elem);
        Node curr = head;
        if (head == null) {
            head = node;
        } else {
            while (curr.nextElem != null) {
                curr = curr.nextElem;
            }
            curr.nextElem = node;
        }
        size++;
    }

    public boolean remove(Object data) throws IllegalStateException {
        if (isEmpty()) {
            throw new IllegalStateException("Нельзя удалять элемениы из пустого списка");
        }
        Node current = head;
        Node prev = null;
        while (current.nextElem != null) {

            if (current.data == data) {
                if (current == head) {
                    if (size == 1) {
                        head = null;
                    } else {
                        head = head.nextElem;
                    }

                } else {
                    prev.nextElem = current.nextElem;
                }
                size--;
                return true;
            }
            prev = current;
            current = current.nextElem;
        }

        return false;
    }

    public void clear() {
        size = 0;
        head = null;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }


    public Iterator<T> iterator() {
        return new ListIterator();
    }

    private class ListIterator<T> implements Iterator<T> {
        private Node current = head;

        @Override
        public T next() throws NoSuchElementException {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T item = (T) current.data;
            current = current.nextElem;
            return item;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

    }
}
