package ru.mirea.practice.solutiontask1;

import java.util.Objects;

public class Node<K, V> {
    public K key;
    public V value;

    public Node(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Node<?, ?> node = (Node<?, ?>) o;
        return key.equals(node.key) && value.equals(node.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    @Override
    public String toString() {
        return key + " " + value;
    }
}
