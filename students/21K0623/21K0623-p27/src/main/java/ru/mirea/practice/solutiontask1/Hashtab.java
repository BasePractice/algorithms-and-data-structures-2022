package ru.mirea.practice.solutiontask1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Hashtab<K, V> {

    private List<Node<K, V>> list;

    public Hashtab() {
        this.list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(null);
        }
    }

    public int hashHash(K k) {
        return Objects.hash(k);
    }

    public void hashAdd(K k, V v) {
        Node<K, V> node = getNodeForKey(k);
        if (node != null) {
            node.setValue(v);
            return;
        }
        node = new Node<>(k, v);
        int index = getIndexForKey(k);
        if (list.get(index) != null) {
            node.setNext(list.get(index));
            node.getNext().setPrev(node);
        }
        list.set(index, node);
    }

    public Node<K, V> getNodeForKey(K key) {
        int index = getIndexForKey(key);
        Node<K, V> search = list.get(index);
        while (search != null) {
            if (search.getKey().equals(key)) {
                return search;
            }
            search = search.getNext();
        }
        return null;
    }

    public int getIndexForKey(K k) {
        return Math.abs(k.hashCode() % list.size());
    }

    public V hashLookup(K k) {
        if (k == null) {
            return null;
        }
        Node<K, V> node = getNodeForKey(k);
        return node == null ? null : node.getValue();
    }

    public void hashDelete(K k) {
        Node<K, V> node = getNodeForKey(k);
        if (node == null) {
            return;
        }
        if (node.getPrev() != null) {
            node.getPrev().setNext(node.getNext());
        } else {
            int hashKey = getIndexForKey(k);
            list.set(hashKey, node.getNext());
        }
        if (node.getNext() != null) {
            node.getNext().setPrev(node.getPrev());
        }
    }
}
