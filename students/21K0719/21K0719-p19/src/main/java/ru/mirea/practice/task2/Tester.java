package ru.mirea.practice.task2;

public abstract class Tester {
    public static void main(String[] args) throws EmptyStringException, StudentNotFoundException {
        Student[] students = new Student[]{new Student(5.1, 12, "Boris Tikva"),
                new Student(2.6, 63, "Kvasenko Bogdan"),
                new Student(3.3, 21, "Kivleeva Stusha"),
                new Student(4.8, 11, "Resolvorov Mikhail")};

        System.out.print("Before sorting:\n");
        print(students);
        MergeSort.mergeSort(students, students.length);
        System.out.println("\nAfter sorting:");
        print(students);
        Student.findStudent(students);
    }

    public static void print(Student[] arr) {
        for (Student student : arr) {
            System.out.print(student + " ");
        }
    }
}