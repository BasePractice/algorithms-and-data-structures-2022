package ru.mirea.workten.task2;

import java.util.Comparator;

public class SortByname implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        return a.getName().compareTo(b.getName());
    }

}
