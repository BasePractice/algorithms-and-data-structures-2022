package ru.mirea.practice.task2;

public class Person {
    private final String frstNm;
    private final String patron;
    private final String lstNm;

    public Person(String frstNm, String patron, String lstNm) {
        this.frstNm = frstNm;
        this.patron = patron;
        this.lstNm = lstNm;
    }

    public String getFrstNm() {
        if (!frstNm.isEmpty()) {
            return frstNm;
        }
        return " ";
    }

    public String getPatron() {
        if (!frstNm.isEmpty()) {
            return patron;
        }
        return " ";
    }

    public String getLstNm() {
        return lstNm;
    }

    @Override
    public String toString() {
        return getFrstNm() + " " + getLstNm() + " " + getPatron();
    }
}
