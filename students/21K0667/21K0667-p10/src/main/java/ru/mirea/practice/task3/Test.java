package ru.mirea.practice.task3;

import ru.mirea.practice.task2.Student;

public abstract class Test {
    public static void main(String[] args) {
        Student[] students = new Student[]{new Student("Павел Ясман", "ИИИ", 1, "АААА-01-01", 3.3),
            new Student("ffаа", "ИИИ", 2, "АААА-02-01", 2.2),
            new Student("фыв", "ИИИ", 3, "АААА-03-01", 4.4),
            new Student("фывфыв", "ИИИ", 4, "АААА-04-01", 3.45)};
        Student.print(students);
        MergeSort.mergeSort(students, students.length);
        System.out.println();
        Student.print(students);
    }

}
