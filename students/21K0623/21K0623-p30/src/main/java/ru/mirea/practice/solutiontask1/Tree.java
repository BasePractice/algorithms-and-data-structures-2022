package ru.mirea.practice.solutiontask1;

public class Tree<K extends Comparable> {
    private Tree<K> left;
    private Tree<K> right;
    private K data;

    public int height(Tree<K> temp) {
        if (temp == null) {
            return 0;
        }
        return Math.max(height(temp.left),height(temp.right)) + 1;
    }

    public void reverse(Tree<K> temp) {
        Tree<K> aboba;
        if (temp != null) {
            aboba = temp.left;
            temp.left = temp.right;
            temp.right = aboba;
            reverse(temp.left);
            reverse(temp.right);
        }
    }

    public int lookup(Tree<K> node, K target) {
        if (node == null) {
            return 0;
        } else {
            if (target.equals(node.data)) {
                return 1;
            } else {
                if (target.compareTo(node.data) < 0) {
                    return lookup(node.left, target);
                } else {
                    return lookup(node.right, target);
                }
            }
        }
    }

    public int getMaxWidth(Tree<K> root) {
        int maxWdth = 0;
        int i;
        int width;
        int h = height(root);
        for (i = 1; i < h; i++) {
            width = getWidth(root, i);
            if (width > maxWdth) {
                maxWdth = width;
            }
        }
        return maxWdth;
    }

    public int getWidth(Tree<K> root, int level) {
        if (root == null) {
            return 0;
        }
        if (level == 1) {
            return 1;
        } else if (level > 1) {
            return getWidth(root.left, level - 1) + getWidth(root.right, level - 1);
        }
        return 0;
    }

    public int size(Tree<K> node) {
        if (node == null) {
            return 0;
        } else {
            return size(node.left) + 1 + size(node.right);
        }
    }

    public boolean sameTree(Tree<K> a, Tree<K> b) {
        if (a == null && b == null) {
            return true;
        } else if (a != null && b != null) {
            return a.data.equals(b.data) && sameTree(a.left, b.left) && sameTree(a.right, b.right);
        } else {
            return false;
        }
    }
}
