package ru.mirea.practice.task3;

import ru.mirea.practice.task1.Student;

public abstract class Tester {
    public static void main(String[] args) {
        Student[] students = new Student[]{new Student("Alexander McQueen", "KVBO-05-21", 2, "Progger", 23),
            new Student("Layne Staley", "KRMO-03-21", 2, "Engeneer", 35),
            new Student("Kurt D. Cobain", "CRIM-03-21", 1, "Modeller", 77),
            new Student("Winona L. Green", "FEDD-06-20", 2, "Modeller", 13)};

        System.out.print("Сортировка по GPA\n");
        print(students);
        MergeSort.mergeSort(students, students.length);
        System.out.println();
        print(students);
    }

    public static void print(Student[] arr) {
        for (Student student : arr) {
            System.out.print(student + "\n");
        }
    }
}
