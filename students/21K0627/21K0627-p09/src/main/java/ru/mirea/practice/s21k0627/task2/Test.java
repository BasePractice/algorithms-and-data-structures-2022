package ru.mirea.practice.s21k0627.task2;

import java.util.ArrayList;
import java.util.List;

public abstract class Test {
    public static void main(String[] args) {
        List<SortingStudentByGPA> students = new ArrayList();
        students.add(new SortingStudentByGPA(17, 10));
        students.add(new SortingStudentByGPA(34, 3));
        students.add(new SortingStudentByGPA(13, 7));
        students.add(new SortingStudentByGPA(14, 5));
        students.sort(new SortingStudentByGPA(1, 1));
        for (SortingStudentByGPA s1 : students) {
            System.out.println(s1);
        }
    }
}
