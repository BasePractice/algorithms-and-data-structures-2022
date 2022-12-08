package ru.mirea.practice.solutiontask2;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Huffman {
    private final Map<Character, String> huffmanCode = new HashMap<>();
    private final String text;

    public Huffman(String text) {
        this.text = text;
        Map<Character, Integer> freq = new HashMap<>();
        for (char c: text.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        PriorityQueue<Tree> queue = new PriorityQueue<>(Comparator.comparingInt(Tree::getCount));
        for (var entry: freq.entrySet()) {
            queue.add(new Tree(entry.getKey(), entry.getValue()));
        }
        while (queue.size() != 1) {
            Tree left = queue.poll();
            Tree right = queue.poll();
            assert left != null;
            assert right != null;
            int sum = left.getCount() + right.getCount();
            queue.add(new Tree(null, sum, left, right));
        }
        Tree root = queue.peek();
        encodeStr(root, "");
    }

    public void printHuffmanCodes() {
        System.out.println("Все закодированные символы: " + huffmanCode);
        System.out.println("Данная строка: " + text);

        StringBuilder encodenig = new StringBuilder();
        for (char letter: text.toCharArray()) {
            encodenig.append(huffmanCode.get(letter));
        }
        System.out.println("Закодированный вид: " + encodenig);
    }

    public void encodeStr(Tree root, String str) {
        if (root == null) {
            return;
        }
        if (root.isLast()) {
            huffmanCode.put(root.getLetter(), str.length() > 0 ? str : "1");
        }
        encodeStr(root.getLeft(), str + '0');
        encodeStr(root.getRight(), str + '1');
    }
}
