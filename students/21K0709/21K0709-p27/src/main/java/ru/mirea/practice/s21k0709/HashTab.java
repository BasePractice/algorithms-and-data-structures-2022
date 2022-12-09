package ru.mirea.practice.s21k0709;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HashTab<K, V> {
    private List<Node<K, V>> nodeList;

    private class Node<K, V> {
        public K key;
        public V value;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Node<?, ?> node = (Node<?, ?>) obj;
            return key.equals(node.key) && value.equals(node.value);
        }

        @Override
        public int hashCode() {
            return Objects.hash(key, value);
        }
    }

    public HashTab() {
        nodeList = new ArrayList<>();
    }

    public void hashAdd(K key, V value) {
        for (Node<K, V> node : nodeList) {
            if (node.hashCode() == Objects.hash(key, value)) {
                System.out.println("Object " + key + ": " + value + " already added");
                return;
            }

        }
        nodeList.add(new Node<>(key, value));
    }

    public boolean hashDelete(K key) {
        for (int i = 0; i < nodeList.size(); i++) {
            if (nodeList.get(i).key.equals(key)) {
                nodeList.remove(i);
                return true;
            }
        }
        return false;
    }

    public void hashValues() {
        for (Node<K, V> node : nodeList) {
            System.out.println(node.key + ": " + node.value);
        }
    }

    public int hashtableHash(K key) {
        for (Node<K, V> node : nodeList) {
            if (node.key.equals(key)) {
                return node.hashCode();
            }
        }
        return 0;

    }

}