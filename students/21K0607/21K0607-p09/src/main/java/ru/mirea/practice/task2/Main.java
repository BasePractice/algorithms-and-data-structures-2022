package ru.mirea.practice.task2;


import ru.mirea.practice.task1.Student;

import java.util.Arrays;

public abstract class Main {
    public static void main(String[] args) {
        SortingStudents sortingStudents = new SortingStudents(4);
        Student student1 = new Student("test", 1234, 21341);
        Student student2 = new Student("test1", 321654, 4131);
        Student student3 = new Student("test2", 96, 111);
        Student student4 = new Student("test3", 60, 116);
        sortingStudents.setLists(new Student[]{student1, student2, student3, student4});
        System.out.println("Before: ");
        System.out.println(Arrays.toString(sortingStudents.getLists()));
        sortingStudents.quickSort(0, sortingStudents.getListLength() - 1);
        System.out.println("After: ");
        System.out.println(Arrays.toString(sortingStudents.getLists()));
    }
}
