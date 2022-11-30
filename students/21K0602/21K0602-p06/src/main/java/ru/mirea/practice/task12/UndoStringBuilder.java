package ru.mirea.practice.task12;

import java.util.Stack;

public class UndoStringBuilder {
    protected String strings;

    private Stack<Action> operations;


    public UndoStringBuilder() {
        operations = new Stack<>();
        strings = "";
    }

    public UndoStringBuilder reverse() {
        strings = new StringBuilder(strings).reverse().toString();
        operations.add(new Action() {
            @Override
            public void undo() {
                strings = new StringBuilder(strings).reverse().toString();
            }
        });
        return this;
    }

    public UndoStringBuilder append(String string) {
        strings = new StringBuilder(strings).append(string).toString();
        operations.add(new Action() {
            @Override
            public void undo() {
                strings = new StringBuilder(strings).delete(strings.length() - string.length(), strings.length()).toString();
            }
        });
        return this;
    }

    public UndoStringBuilder insert(int start, String string) {

        strings = new StringBuilder(strings).insert(start, string).toString();
        operations.add(new Action() {
            @Override
            public void undo() {
                strings = new StringBuilder(strings).replace(start, string.length() + 1, "").toString();
            }
        });
        return this;
    }

    public UndoStringBuilder replace(int start, int end, String replaceString) {
        String replacedString = strings.substring(start, end);
        strings = new StringBuilder(strings).replace(start, end, replaceString.substring(0, end)).toString();
        operations.add(new Action() {
            @Override
            public void undo() {
                strings = new StringBuilder(strings).replace(start, end, replacedString).toString();
            }
        });
        return this;

    }

    public UndoStringBuilder delete(int start, int end) {
        String deletedString = strings.substring(start, end);
        strings = new StringBuilder(strings).delete(start, end).toString();
        operations.add(new Action() {
            @Override
            public void undo() {
                strings = new StringBuilder(strings).insert(start, deletedString).toString();
            }
        });
        return this;
    }

    public void undo() {
        if (!operations.isEmpty()) {
            operations.pop().undo();
        }
    }

    @Override
    public String toString() {
        return strings;
    }
}
