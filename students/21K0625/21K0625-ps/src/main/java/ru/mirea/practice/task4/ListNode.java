package ru.mirea.practice.task4;

class ListNode<S> {
    S data;
    ListNode<S> next;
    ListNode<S> prev;

    ListNode(S data) {
        this(null, data, null);
    }

    ListNode(ListNode<S> prev, S data, ListNode<S> next) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}
