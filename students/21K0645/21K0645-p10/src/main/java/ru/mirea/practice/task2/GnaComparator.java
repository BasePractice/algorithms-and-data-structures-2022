package ru.mirea.practice.task2;

import java.util.Comparator;

public class GnaComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o1.getGpa(), o2.getGpa());
    }
}
