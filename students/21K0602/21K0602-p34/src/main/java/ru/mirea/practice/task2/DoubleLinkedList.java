package ru.mirea.practice.task2;


public class DoubleLinkedList<T> {
    private Node<T> head;

    private Node<T> tail;

    public DoubleLinkedList() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void add(T value) {
        Node<T> node = new Node<>(value, null, null);
        if (isEmpty()) {
            head = node;
        }
        node.previous = tail;
        tail = node;
        tail.next = null;
        head.previous = null;

    }

    public T removeFirst() {
        T value;
        if (head != null) {
            value = head.value;
            if (tail == head) {
                head = null;
                tail = null;
            } else {
                head = head.next;
            }
            return value;
        } else {
            return null;
        }
    }


    public void print() {
        if (!isEmpty()) {
            Node<T> node = head;
            do {
                System.out.println(node.value);
                node = node.next;
            } while (node != head);
        } else {
            System.out.println("List is null");
        }
    }
}
