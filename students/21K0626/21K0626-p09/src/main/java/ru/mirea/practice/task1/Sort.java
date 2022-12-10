package ru.mirea.practice.task1;

import java.util.Arrays;

public class Sort {
    public int size;

    public Student[] arr;

    Sort(int size) {
        this.size = size;
        this.arr = new Student[size];
    }
    public void vstavk() {
        int a = 0;
        for (int i = 1; i < size; i++) {
            int b = this.arr[i].age;
            for (a = i; a > 0 && b < this.arr[a - 1].age; a--) {
                this.arr[a].age = this.arr[a - 1].age;
            }
            this.arr[a].age = b;
        }
    }

    public void setStudents(Student k, int n) {
        this.arr[n] = k;
    }

    @Override
    public String toString() {
        return "Sort{"
                +
                "n=" + size
                +
                ", a=" + Arrays.toString(arr)
                +
                '}';
    }
    public static void main(String[] args) {
        Student stud0 = new Student(22, "Yuriy", "Likov");
        Student stud1 = new Student(23, "Leonard", "Kotov");
        Student stud2 = new Student(18, "Dmitriy", "Javov");
        Student stud3 = new Student(19, "Jame", "Pythonov");
        Student stud4 = new Student(21, "Soul", "Assemblerov");

        Sort iDNumber = new Sort(5);
        iDNumber.setStudents(stud0, 0);
        iDNumber.setStudents(stud1, 1);
        iDNumber.setStudents(stud2, 2);
        iDNumber.setStudents(stud3, 3);
        iDNumber.setStudents(stud4, 4);
        System.out.println(iDNumber);
        iDNumber.vstavk();
        System.out.println(iDNumber);
    }


}
