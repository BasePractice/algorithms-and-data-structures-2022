package ru.mirea.practice;

import java.util.Comparator;

public class SortingStudentByGpa implements Comparator<Student> {
    private static Student[] idNumber;

    public void setArray(Student[] students) {
        idNumber = new Student[students.length];
        System.arraycopy(students, 0, idNumber, 0, students.length);
    }

    public void getArray() {
        for (Student student: idNumber) {
            System.out.println(student);
        }
    }

    public void quickSort(Comparator<Student> comparator, int start, int end) {
        if (start < end) {
            int partitionIdx = partition(comparator, start, end);

            quickSort(comparator, start, partitionIdx - 1);
            quickSort(comparator, partitionIdx + 1, end);
        }
    }

    private static int partition(Comparator<Student> comparator, int start, int end) {
        Student pivot = idNumber[end];
        int i = start - 1;
        for (int j = start; j < end; j++) {
            if (comparator.compare(pivot, idNumber[j]) <= 0) {
                i++;

                Student tmp = idNumber[i];
                idNumber[i] = idNumber[j];
                idNumber[j] = tmp;
            }
        }

        Student tmp = idNumber[i + 1];
        idNumber[i + 1] = idNumber[end];
        idNumber[end] = tmp;

        return i + 1;
    }

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getMark() - o2.getMark();
    }
}
