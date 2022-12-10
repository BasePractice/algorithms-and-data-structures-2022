package ru.mirea.practice.solutiontask2;

public class Tree {
    private final Character letter;
    private final Integer count;
    private Tree left = null;
    private Tree right = null;

    public Tree(Character letter, Integer count) {
        this.letter = letter;
        this.count = count;
    }

    public Tree(Character letter, Integer count, Tree left, Tree right) {
        this.letter = letter;
        this.count = count;
        this.left = left;
        this.right = right;
    }

    public int getCount() {
        return count;
    }

    public Tree getLeft() {
        return left;
    }

    public Tree getRight() {
        return right;
    }

    public char getLetter() {
        return letter;
    }

    public boolean isLast() {
        return left == null && right == null;
    }
}
