package ru.mirea.practice.task2;

import java.util.Scanner;

public abstract class SortingStudentsByGpa {
    public static void main(String[] args) {
        Student[] idNumber = new Student[3];
        setArray(idNumber);
        print(idNumber);
        System.out.print("----------------------------------------------------------------------------------\n");
        quickSort(idNumber, 0, idNumber.length - 1);
        print(idNumber);
    }

    public static void setArray(Student[] mass) {
        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < mass.length; i++) {
                System.out.print("1) Имя");
                System.out.print("2) Группа");
                System.out.print("3) Курс");
                System.out.print("4) Специализация");
                System.out.print("5) GPA");
                sc.nextLine();
                Student tempStudent = new Student(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextLine(), sc.nextDouble());
                mass[i] = tempStudent;
            }
        }
    }

    public static void quickSort(Student[] mass, int left, int right) {
        if (left < right) {
            int divideIndex = divide(mass, left, right);

            quickSort(mass, left, divideIndex - 1);
            quickSort(mass, divideIndex + 1, right);
        }
    }

    private static int divide(Student[] mass, int left, int right) {
        Student opora = mass[right];
        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (mass[j].compare(mass[j], opora) > 0) {
                i++;
                swap(mass, i, j);
            }
        }
        swap(mass, i + 1, right);
        return i + 1;
    }

    public static void swap(Student[] mass, int firstIndex, int secondIndex) {
        Student swap = mass[firstIndex];
        mass[firstIndex] = mass[secondIndex];
        mass[secondIndex] = swap;
    }


    public static void print(Student[] mass) {
        for (Student student : mass) {
            System.out.println(student);
        }
    }
}
