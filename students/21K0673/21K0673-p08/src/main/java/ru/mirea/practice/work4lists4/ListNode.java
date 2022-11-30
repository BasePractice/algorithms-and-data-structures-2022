package ru.mirea.practice.work4lists4;

class ListNode<T> {
    T data;
    ListNode<T> next;
    ListNode<T> prev;

    ListNode(T data) {
        this(null, data, null);
    }

    ListNode(ListNode<T> prev, T data, ListNode<T> next) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}
