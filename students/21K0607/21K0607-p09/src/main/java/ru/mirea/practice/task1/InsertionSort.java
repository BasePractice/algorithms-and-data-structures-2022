package ru.mirea.practice.task1;

import java.util.Arrays;

public class InsertionSort {

    private Student[] studentsList;
    private int length;


    public InsertionSort(int length) {
        this.length = length;
        studentsList = new Student[length];
    }

    public Student[] getStudentsList() {
        return studentsList;
    }


    public void setStudentsList(Student[] studentsList) {
        this.studentsList = studentsList;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void insertionSort() {
        System.out.println("До");
        System.out.println(Arrays.toString(studentsList));
        for (int left = 0; left < length; left++) {
            Student student = studentsList[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (student.getIdNumber() < studentsList[i].getIdNumber()) {
                    studentsList[i + 1] = studentsList[i];
                } else {
                    break;
                }
            }
            studentsList[i + 1] = student;
        }
        System.out.println("После");
        System.out.println(Arrays.toString(studentsList));

    }
}
