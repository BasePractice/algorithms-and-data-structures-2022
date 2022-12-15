package ru.mirea.practice.task1;

import java.util.Stack;

class TwoThreeTree {
    private static class Node {
        int key1;
        int key2;
        Node left;
        Node middle;
        Node right;

        Node(int key1, int key2) {
            this.key1 = key1;
            this.key2 = key2;
        }
    }

    private Node root;

    public void insert(int key) {
        if (root == null) {
            root = new Node(key, 0);
            return;
        }

        Node current = root;
        while (true) {
            if (key == current.key1 || key == current.key2) {
                return;
            }

            if (current.key2 == 0) {
                if (key < current.key1) {
                    current.key2 = current.key1;
                    current.key1 = key;
                } else {
                    current.key2 = key;
                }
                return;
            }

            if (key < current.key1) {
                Node newNode = new Node(current.key2, 0);
                newNode.left = current.middle;
                newNode.right = current.right;
                current.key2 = 0;
                current.middle = newNode;
                current.right = null;
                current.key1 = key;
                return;
            } else if (key < current.key2) {
                Node newNode = new Node(current.key2, 0);
                newNode.left = current.middle;
                newNode.right = current.right;
                current.key2 = 0;
                current.middle = newNode;
                current.right = null;
                current.middle.key1 = key;
                return;
            } else {
                Node newNode = new Node(key, 0);
                newNode.left = current.right;
                current.right = newNode;
                current.key2 = 0;
                return;
            }
        }
    }



    public void delete(int key) {

        if (root == null) {
            return;
        }

        Node current = root;
        while (true) {

            if (key != current.key1 && key != current.key2) {
                return;
            }

            if (current.key2 == 0) {
                if (key == current.key1) {
                    current.key1 = 0;
                } else {
                    current.key2 = 0;
                }
                return;
            }


            if (key == current.key1) {
                current.key1 = current.key2;
                current.key2 = 0;
                return;
            } else {
                current.key2 = 0;
                return;
            }
        }
    }


    public void print() {

        if (root == null) {
            return;
        }


        Stack<Node> stack = new Stack<>();
        Node current = root;
        while (current != null || !stack.isEmpty()) {
            if (current != null) {
                stack.push(current);
                current = current.left;
            } else {
                current = stack.pop();
                System.out.println(current.key1);
                if (current.key2 != 0) {
                    System.out.println(current.key2);
                }
                current = current.middle;
            }
        }
    }


}


