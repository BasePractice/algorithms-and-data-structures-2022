package ru.mirea.worksix.task12;


import java.util.Stack;

public class Strings {
    private final Stack<Action> actions = new Stack<>();
    private String stri = "";

    public String getStri() {
        return stri;
    }

    public Strings append(String str) {
        stri = stri + str;
        actions.add(() -> new StringBuilder(stri).delete(stri.length() - str.length(),
                stri.length()).toString());
        return this;
    }

    public int compareTo(Strings a) {
        return stri.compareTo(a.getStri());
    }

    public Strings delete(int a, int b) {
        String str = stri.substring(a, b);
        stri = new StringBuilder(stri).delete(a, b).toString();
        actions.add(() -> stri.substring(0, a) + str + stri.substring(b));
        return this;
    }

    public Strings deleteCharAt(int a) {
        char deleteChar = stri.charAt(a);
        stri = new StringBuilder(stri).deleteCharAt(a).toString();
        actions.add(() -> stri.substring(0, a) + deleteChar + stri.substring(a));
        return this;
    }

    public int indexOf(String str) {
        return stri.indexOf(str);
    }

    public Strings insert(int a, String str) {
        stri = stri.substring(0, a) + str + stri.substring(a);
        actions.add(new StringBuilder(stri).delete(a, a + str.length())::toString);
        return this;
    }

    public int lastIndexOf(String str) {
        return stri.lastIndexOf(str);
    }

    public int lastIndexOf(String str, int a) {
        return stri.lastIndexOf(str, a);
    }

    public Strings replace(int a, int b, String str) {
        String replaceString = stri.substring(a, b);
        stri = new StringBuilder(stri).replace(a, b, str).toString();
        actions.add(() -> new StringBuilder(stri).replace(a, b, replaceString).toString());
        return this;
    }

    public Strings reverse() {
        stri = new StringBuilder(stri).reverse().toString();
        actions.add(() -> new StringBuilder(stri).reverse().toString());
        return this;
    }

    public void undo() {
        if (!actions.isEmpty()) {
            stri = actions.pop().undo();
        }
    }

    @Override
    public String toString() {
        return stri.toString();
    }

    private interface Action {
        String undo();
    }
}

