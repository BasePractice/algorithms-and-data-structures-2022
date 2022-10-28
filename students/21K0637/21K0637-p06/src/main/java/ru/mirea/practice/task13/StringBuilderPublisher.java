package ru.mirea.practice.task13;

public class StringBuilderPublisher {
    private String string = "";
    private OnStringBuilderChangeListener listener;

    public void setListener(OnStringBuilderChangeListener listener) {
        this.listener = listener;
    }

    public void notifyListener() {
        if (listener != null) {
            listener.onChange(this);
        }
    }

    public StringBuilderPublisher append(String str) {
        string += str;
        notifyListener();
        return this;
    }

    public StringBuilderPublisher delete(int start, int end) {
        string = new StringBuilder(string).delete(start, end).toString();
        notifyListener();
        return this;
    }

    public StringBuilderPublisher deleteCharAt(int idx) {
        string = new StringBuilder(string).deleteCharAt(idx).toString();
        return this;
    }

    public StringBuilderPublisher insert(int idx, String str) {
        string = string.substring(0, idx) + str + string.substring(idx);
        notifyListener();
        return this;
    }

    public int lastIndexOf(String str) {
        return string.lastIndexOf(str);
    }

    public int lastIndexOf(String str, int idx) {
        return string.lastIndexOf(str, idx);
    }

    public int indexOf(String str) {
        return string.indexOf(str);
    }

    public StringBuilderPublisher replace(int start, int end, String str) {
        string = new StringBuilder(string).replace(start, end, str).toString();
        notifyListener();
        return this;
    }

    public StringBuilderPublisher reverse() {
        string = new StringBuilder(string).reverse().toString();
        notifyListener();
        return this;
    }

    @Override
    public String toString() {
        return string.toString();
    }

    public int length() {
        return string.length();
    }
}
