package ru.mirea.worknineteen.task2;

import java.util.Comparator;

public class SortBygpa implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        return b.getGpa() - a.getGpa();
    }

}
