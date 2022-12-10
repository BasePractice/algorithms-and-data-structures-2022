package ru.mirea.practice.task2;

import java.util.Comparator;

public class SortingStudentsByGpa implements Comparator<SortingStudentsByGpa> {
    private double gpa;
    private SortingStudentsByGpa[] mass;

    public SortingStudentsByGpa(SortingStudentsByGpa[] mass) {
        this.mass = mass;
    }

    public SortingStudentsByGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public SortingStudentsByGpa[] getMass() {
        return mass;
    }

    public void quickSort(SortingStudentsByGpa[] source, int low, int high) {
        if (source.length == 0) {
            return;
        }
        if (low >= high) {
            return;
        }
        int middle = low + (high - low) / 2;
        SortingStudentsByGpa opora = new SortingStudentsByGpa(source[middle].getGpa());
        int i = low;
        int j = high;
        while (i <= j) {
            while (compare(source[i], opora) < 0) {
                i++;
            }

            while (compare(source[i], opora) > 0) {
                j--;
            }

            if (i <= j) {
                double temp = source[i].getGpa();
                source[i].setGpa(source[j].getGpa());
                source[j].setGpa(temp);
                i++;
                j--;
            }
        }
        if (low < j) {
            quickSort(source, low, j);
        }
        if (high > i) {
            quickSort(source, i, high);
        }
    }

    public void print() {
        for (SortingStudentsByGpa sortingStudentsByGpa : mass) {
            System.out.print(sortingStudentsByGpa.getGpa() + " ");
        }
        System.out.println();
    }

    @Override
    public int compare(SortingStudentsByGpa first, SortingStudentsByGpa second) {
        if (first.getGpa() == second.getGpa()) {
            return 0;
        }
        if (first.getGpa() > second.getGpa()) {
            return 1;
        }
        return -1;
    }
}
