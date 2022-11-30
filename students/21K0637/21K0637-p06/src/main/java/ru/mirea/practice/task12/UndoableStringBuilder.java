package ru.mirea.practice.task12;

import java.util.Stack;

public class UndoableStringBuilder {
    private final Stack<Action> actions = new Stack<>();
    private String string = "";

    public String getString() {
        return string;
    }

    public UndoableStringBuilder append(String str) {
        string = string + str;
        actions.add(() -> new StringBuilder(string).delete(string.length() - str.length(),
            string.length()).toString());
        return this;
    }

    public int compareTo(UndoableStringBuilder otherUndoStringBuilder) {
        return string.compareTo(otherUndoStringBuilder.getString());
    }

    public UndoableStringBuilder delete(int start, int end) {
        String str = string.substring(start, end);
        string = new StringBuilder(string).delete(start, end).toString();
        actions.add(() -> string.substring(0, start) + str + string.substring(end));
        return this;
    }

    public UndoableStringBuilder deleteCharAt(int idx) {
        char deleteChar = string.charAt(idx);
        string = new StringBuilder(string).deleteCharAt(idx).toString();
        actions.add(() -> string.substring(0, idx) + deleteChar + string.substring(idx));
        return this;
    }

    public int indexOf(String str) {
        return string.indexOf(str);
    }

    public UndoableStringBuilder insert(int idx, String str) {
        string = string.substring(0, idx) + str + string.substring(idx);
        actions.add(new StringBuilder(string).delete(idx, idx + str.length())::toString);
        return this;
    }

    public int lastIndexOf(String str) {
        return string.lastIndexOf(str);
    }

    public int lastIndexOf(String str, int idx) {
        return string.lastIndexOf(str, idx);
    }

    public UndoableStringBuilder replace(int start, int end, String str) {
        String replaceString = string.substring(start, end);
        string = new StringBuilder(string).replace(start, end, str).toString();
        actions.add(() -> new StringBuilder(string).replace(start, end, replaceString).toString());
        return this;
    }

    public UndoableStringBuilder reverse() {
        string = new StringBuilder(string).reverse().toString();
        actions.add(() -> new StringBuilder(string).reverse().toString());
        return this;
    }

    public void undo() {
        if (!actions.isEmpty()) {
            string = actions.pop().undo();
        }
    }

    @Override
    public String toString() {
        return string.toString();
    }

    private interface Action {
        String undo();
    }
}