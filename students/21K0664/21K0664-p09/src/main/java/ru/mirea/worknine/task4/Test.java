package ru.mirea.worknine.task4;

public class Test implements Comparable {
    private int n;
    private Student[] arr;

    Test(int n) {
        this.n = n;
        this.arr = new Student[n];
    }

    public void setStudent(Student student, int v) {
        this.arr[v] = student;
    }

    public String toString() {
        System.out.println("\n");
        for (int i = 0; i < this.n; i++) {
            System.out.println("{" + this.arr[i].toString() + "}");
        }
        return " ";
    }

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

    public static void main(String[] args) {
        Student a = new Student("Ivan", 25, 99);
        Student b = new Student("Max", 15, 100);
        Student c = new Student("Anna", 24, 42);

        Test arr = new Test(3);
        arr.setStudent(a, 0);
        arr.setStudent(b, 1);
        arr.setStudent(c, 2);

        System.out.println(arr);
    }
}
