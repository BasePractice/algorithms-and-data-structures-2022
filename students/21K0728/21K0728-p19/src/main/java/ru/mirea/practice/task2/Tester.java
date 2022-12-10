package ru.mirea.practice.task2;

public abstract class Tester {
    public static void main(String[] args) throws EmptyStringExc, StudentNotFoundExc {
        Student[] stud = new Student[]{new Student(4.5, 199, "John Snow"),
            new Student(3.2, 154, "Keanu Reaves"),
            new Student(2.8, 241, "XYZ"),
            new Student(4.6, 357, "241")};

        System.out.print("Before sorting:\n");
        print(stud);
        MergeSorting.mergeSort(stud, stud.length);
        System.out.println("\nAfter sorting:");
        print(stud);

        Student.findStudent(stud);
    }

    public static void print(Student[] arr) {
        for (Student student : arr) {
            System.out.print(student + " ");
        }
    }
}
