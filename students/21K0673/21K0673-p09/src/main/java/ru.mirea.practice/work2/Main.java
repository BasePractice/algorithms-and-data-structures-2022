package ru.mirea.practice.work2;

import java.util.ArrayList;
import java.util.List;

abstract class Main {
    public static void main(String[] args) {
        List<SortingStudentbygpa> list = new ArrayList<SortingStudentbygpa>();
        list.add(new SortingStudentbygpa(100));
        list.add(new SortingStudentbygpa(23));
        list.add(new SortingStudentbygpa(32));
        list.add(new SortingStudentbygpa(14));
        list.add(new SortingStudentbygpa(11));

        list.sort(new SortingStudentbygpa(1));

        for (SortingStudentbygpa sortingStudentbygpa : list) {
            System.out.println(sortingStudentbygpa.getMark());
        }
    }
}
