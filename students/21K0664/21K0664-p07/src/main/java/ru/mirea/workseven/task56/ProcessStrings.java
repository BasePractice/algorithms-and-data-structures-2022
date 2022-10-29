package ru.mirea.workseven.task56;

public class ProcessStrings implements Stroka {
    private String str;

    ProcessStrings(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int countingQuantity() {
        int count = 0;
        for (int i = 0; i < this.str.length(); i++) {
            count++;
        }
        return count;
    }

    public String invert() {
        return new StringBuffer(this.str).reverse().toString();
    }

    public String oddString() {
        char[] c = str.toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = c.length - 1; i > 0; i--) {
            if ((i + 1) % 2 != 0) {
                result.insert(0, c[i]);
            }
        }
        return c[0] + result.toString();
    }

    public String toString() {
        return str;
    }
}
