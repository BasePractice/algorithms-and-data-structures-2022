package ru.mirea.practice.task3;

/* Напишите программу, которая объединяет два списка данных о студентах
в один отсортированный списках. */

import java.util.ArrayList;
import java.util.List;

public final class Main {

    private Main() {
    }

    public static void setArray(List<Student> array) {
        array.add(new Student("Name1", "Surname1", "Speciality1", 1, 1, 1, 5.0));
        array.add(new Student("Name2", "Surname2", "Speciality1", 3, 1, 5, 13));
        array.add(new Student("Name3", "Surname3", "Speciality1", 2, 2, 3, 4));
        array.add(new Student("Name4", "Surname4", "Speciality1", 1, 2, 6, 10));
        array.add(new Student("Name5", "Surname5", "Speciality1", 5, 2, 9, 5));
    }

    public static void main(String[] args) {

        List<Student> studentList1 = new ArrayList<>();
        setArray(studentList1);

        List<Student> studentList2 = new ArrayList<>();
        setArray(studentList2);

        List<Student> students = new ArrayList<>();
        students.addAll(studentList1);
        students.addAll(studentList2);

        students.sort(new GnaComparator());
    }
}
