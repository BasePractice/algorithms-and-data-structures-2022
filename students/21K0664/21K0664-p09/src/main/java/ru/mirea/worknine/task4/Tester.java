package ru.mirea.worknine.task4;

public class Tester implements Comparable {
    private int n;
    private Student[] arr;

    Tester(int n) {
        this.n = n;
        this.arr = new Student[n];
    }

    public void setStudent(Student student, int v) {
        this.arr[v] = student;
    }

    @Override
    public String toString() {
        System.out.println("\n");
        for (int i = 0; i < this.n; i++) {
            System.out.println("{" + this.arr[i].toString() + "}");
        }
        return " ";
    }

    @Override
    public void sort() {
        for (int i = 0; i < this.n - 1; i++) {
            for (int j = 1; j < this.n; j++) {
                if (this.arr[i].gpa > this.arr[j].gpa) {
                    Student buff = this.arr[j];
                    this.arr[j] = this.arr[i];
                    this.arr[i] = buff;
                }
            }
        }
    }


}
