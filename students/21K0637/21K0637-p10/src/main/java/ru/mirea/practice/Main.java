package ru.mirea.practice;

import java.util.Comparator;
import java.util.Random;

public abstract class Main {
    public static void main(String[] args) {
        SortingStudentByGpa sort = new SortingStudentByGpa();

        Student[] students = new Student[] {
            new Student("Ivanov", "III", 2, "KVBO-02-21"),
            new Student("Sidorov", "IT", 2, "IVBO-02-21"),
            new Student("Petrov", "IT", 3, "IVBO-03-20"),
            new Student("Karpov", "MITHT", 1, "RBBO-09-22")
        };

        for (Student student : students) {
            student.setMark(new Random().nextInt(100));
        }

        sort.setArray(students);

        Comparator<Student> markComparator = Comparator.comparingInt(Student::getMark);
        Comparator<Student> courseComparator = Comparator.comparingInt(Student::getCourse);
        Comparator<Student> comparator = markComparator.thenComparing(courseComparator);

        sort.quickSort(comparator, 0, students.length - 1);
        sort.getArray();
    }
}
