package ru.mirea.practice.solutiontask1;

import java.util.ArrayList;
import java.util.List;

public class Hashtab<K, V> {

    private List<Node<K, V>> list;

    public Hashtab() {
        list = new ArrayList<>();
    }

    public void hashAdd(K key, V value) {
        Node<K, V> temp = hashLookup(key);
        if (temp != null) {
            hashDelete(key);
        }
        list.add(new Node<>(key, value));
    }

    public void hashDelete(K key) {
        list.remove(hashLookup(key));
    }

    public Node<K, V> hashLookup(K k) {
        for (Node<K, V> kvNode : list) {
            if (kvNode.getKey().equals(k)) {
                return kvNode;
            }
        }
        return null;
    }

    public int hashtableHash(K key) {
        Node<K, V> temp = hashLookup(key);
        if (temp == null) {
            return -1;
        }
        return hashLookup(key).hashCode();
    }
}
