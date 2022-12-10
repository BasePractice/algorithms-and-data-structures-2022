package ru.mirea.practice.s21k0627;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    private static Student[] studsort;

    public void setArray(Student[] students) {
        studsort = new Student[students.length];
        for (int i = 0; i < students.length; i++) {
            studsort[i] = students[i];
        }
    }

    public void getArray() {
        for (Student student : studsort) {
            System.out.println(student);
        }
    }

    public void quickSort(Comparator<Student> comparator, int first, int last) {
        if (first < last) {
            int sortId = sort(comparator, first, last);
            quickSort(comparator, first, sortId - 1);
            quickSort(comparator, sortId + 1, last);
        }
    }

    private static int sort(Comparator<Student> comparator, int first, int last) {
        Student s1 = studsort[last];
        int i = first - 1;
        for (int j = first; j < last; j++) {
            if (comparator.compare(s1, studsort[j]) <= 0) {
                i++;
                Student temp = studsort[i];
                studsort[i] = studsort[j];
                studsort[j] = temp;
            }
        }

        Student temp = studsort[i + 1];
        studsort[i + 1] = studsort[last];
        studsort[last] = temp;

        return i + 1;
    }

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getScore() - o2.getScore();
    }
}