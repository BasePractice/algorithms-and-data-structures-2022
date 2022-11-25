package ru.mirea.worksix.task13;


public class Str {
    private String stroka = "";
    private SBuilder v;

    public void setV(SBuilder v) {
        this.v = v;
    }

    public void notifyListener() {
        if (v != null) {
            v.onChange(this);
        }
    }

    public Str append(String str) {
        stroka += str;
        notifyListener();
        return this;
    }

    public Str delete(int a, int b) {
        stroka = new StringBuilder(stroka).delete(a, b).toString();
        notifyListener();
        return this;
    }

    public Str deleteCharAt(int a) {
        stroka = new StringBuilder(stroka).deleteCharAt(a).toString();
        return this;
    }

    public Str insert(int idx, String str) {
        stroka = stroka.substring(0, idx) + str + stroka.substring(idx);
        notifyListener();
        return this;
    }

    public int lastIndexOf(String str) {
        return stroka.lastIndexOf(str);
    }

    public int lastIndexOf(String str, int a) {
        return stroka.lastIndexOf(str, a);
    }

    public int indexOf(String str) {
        return stroka.indexOf(str);
    }

    public Str replace(int a, int b, String str) {
        stroka = new StringBuilder(stroka).replace(a, b, str).toString();
        notifyListener();
        return this;
    }

    public Str reverse() {
        stroka = new StringBuilder(stroka).reverse().toString();
        notifyListener();
        return this;
    }

    @Override
    public String toString() {
        return stroka.toString();
    }

    public int length() {
        return stroka.length();
    }
}