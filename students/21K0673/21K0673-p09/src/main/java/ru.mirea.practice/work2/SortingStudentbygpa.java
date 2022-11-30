package ru.mirea.practice.work2;

import java.util.Comparator;

public class SortingStudentbygpa implements Comparator<SortingStudentbygpa> {

    int mark;

    public int getMark() {
        return this.mark;
    }

    SortingStudentbygpa(int mark) {
        this.mark = mark;
    }

    @Override
    public int compare(SortingStudentbygpa o1, SortingStudentbygpa o2) {
        if (o1.getMark() == o2.getMark()) {
            return 0;
        }
        if (o1.getMark() < o2.getMark()) {
            return 1;
        }
        return -1;
    }
}
