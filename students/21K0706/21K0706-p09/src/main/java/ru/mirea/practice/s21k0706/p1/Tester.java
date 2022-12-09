package ru.mirea.practice.s21k0706.p1;

public final class Tester {
    private Tester() {

    }

    public static void main(String[] args) {
        Student []students = new Student[5];
        students[0] = new Student(5234, "A B");
        students[1] = new Student(7152, "C D");
        students[2] = new Student(6412, "E F");
        students[3] = new Student(3125, "G K");
        students[4] = new Student(9432, "N M");
        insertionSort(students);

        for (Student x: students) {
            System.out.println(x);
        }

    }

    public static void insertionSort(Student []students) {
        for (int i = 1; i < students.length; i++) {
            Student x = students[i];
            int j = i;
            while (j > 0 && students[j - 1].num > x.num) {
                students[j] = students[j - 1];
                j--;
            }
            students[j] = x;
        }
    }
}
