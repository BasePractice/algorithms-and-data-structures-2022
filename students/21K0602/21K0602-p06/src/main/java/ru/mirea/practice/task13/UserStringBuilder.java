package ru.mirea.practice.task13;

public class UserStringBuilder {

    private OnStringChangeListener onStringChangeListener;
    private String string;


    public UserStringBuilder() {
        string = "";
        onStringChangeListener = new StringListener();
    }

    public UserStringBuilder(OnStringChangeListener listener, String string) {
        this.onStringChangeListener = listener;
        this.string = string;
    }

    public void notifyListener() {
        if (onStringChangeListener != null) {
            onStringChangeListener.onChange(this);
        }
    }

    public UserStringBuilder reverse() {
        string = new StringBuilder(string).reverse().toString();
        notifyListener();
        return this;
    }

    public UserStringBuilder append(String str) {
        string = new StringBuilder(string).append(str).toString();
        notifyListener();
        return this;
    }

    public UserStringBuilder insert(int start, String insertString) {
        string = new StringBuilder(string).insert(start, insertString).toString();
        notifyListener();
        return this;
    }

    public UserStringBuilder replace(int start, int end, String replaceString) {
        string = new StringBuilder(string).replace(start, end, replaceString.substring(0, end)).toString();
        notifyListener();
        return this;
    }

    public UserStringBuilder delete(int start, int end) {
        string = new StringBuilder(string).delete(start, end).toString();
        notifyListener();
        return this;
    }


    @Override
    public String toString() {
        return string;
    }
}
