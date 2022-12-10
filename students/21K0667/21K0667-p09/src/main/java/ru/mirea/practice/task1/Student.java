package ru.mirea.practice.task1;

public class Student {
    private int[] studentsId;

    public Student(int[] idStudent) {
        this.studentsId = idStudent;
    }

    public int[] getStudentsId() {
        return studentsId;
    }

    public void sort() {
        for (int i = 0; i < studentsId.length; i++) {
            int k = studentsId[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (k < studentsId[j]) {
                    studentsId[j + 1] = studentsId[j];
                } else {
                    break;
                }
            }
            studentsId[j + 1] = k;
        }
    }

    public void print() {
        for (int j : studentsId) {
            System.out.print("ID: " + j);
        }
    }
}
