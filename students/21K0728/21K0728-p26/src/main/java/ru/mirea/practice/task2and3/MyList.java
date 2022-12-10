package ru.mirea.practice.task2and3;

import java.util.Iterator;


public class MyList<K> {
    private Node head;

    public MyList() {
        head = null;
    }

    public void add(K elem) {
        if (elem == null) {
            throw new NullPointerException("one of elements is null");
        }
        Node t = new Node(elem);
        Node nw = head;
        if (nw == null) {
            head = t;
        } else {
            while (nw.nxt != null) {
                nw = nw.nxt;
            }
            nw.nxt = t;
        }
    }

    public void remove(K element) {
        Node nw = head;
        Node prv = null;

        while (nw.nxt != null) {
            if (nw.dt == element) {
                if (nw == head) {
                    head = nw.nxt;
                } else {
                    prv.nxt = nw.nxt;
                }
            }
            prv = nw;
            nw = nw.nxt;
        }
    }

    public void print() {
        Node nw = head;
        System.out.println(head.dt);
        while (nw.nxt != null) {
            nw = nw.nxt;
            System.out.println(nw.dt);
        }
    }

    public Iterator<K> iterator(int ind) {
        return new MyListIterator(ind);
    }

    private class MyListIterator<T> implements Iterator<T> {
        private Node nw = head;
        private int index;

        public MyListIterator(int index) {
            this.index = index;
        }

        @Override
        public boolean hasNext() {
            return nw.nxt != null;
        }

        @Override
        public T next() {
            for (int i = 0; i < index; i++) {
                nw = nw.nxt;
            }
            return (T) nw.dt;
        }
    }
}
