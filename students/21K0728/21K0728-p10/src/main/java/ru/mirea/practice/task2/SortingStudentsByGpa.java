package ru.mirea.practice.task2;

import ru.mirea.practice.task1.Student;

import java.util.Scanner;

public abstract class SortingStudentsByGpa {
    public static void main(String[] args) {
        Student[] idNumber = new Student[3];
        setArray(idNumber);
        print(idNumber);
        System.out.print("--------------------------------------------------------------------------\n");
        quickSort(idNumber, 0, idNumber.length - 1);
        print(idNumber);
    }

    public static void setArray(Student[] arr) {
        try (Scanner scan = new Scanner(System.in)) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print("Input name: ");
                final String tempName = scan.nextLine();
                System.out.print("Input group: ");
                final String tempGroup = scan.nextLine();
                System.out.print("Input course: ");
                final int tempLevel = scan.nextInt();
                scan.nextLine();
                System.out.print("Input specialization: ");
                final String tempSpecialization = scan.nextLine();
                System.out.print("Input GPA: ");
                double tempGpa = scan.nextDouble();
                scan.nextLine();
                Student tempStudent = new Student(tempName, tempGroup, tempLevel, tempSpecialization, tempGpa);
                arr[i] = tempStudent;
            }
        }
    }

    public static void quickSort(Student[] arr, int leftFirst, int rightFirst) {
        if (leftFirst < rightFirst) {
            int partitionIndex = partition(arr, leftFirst, rightFirst);

            quickSort(arr, leftFirst, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, rightFirst);
        }
    }

    private static int partition(Student[] arr, int leftSecond, int rightSecond) {
        Student pivot = arr[rightSecond];
        int i = leftSecond - 1;

        for (int j = leftSecond; j < rightSecond; j++) {
            if (arr[j].compare(arr[j], pivot) > 0) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, rightSecond);
        return i + 1;
    }

    public static void swap(Student[] arr, int indexArr1, int indexArr2) {
        Student swapTemp = arr[indexArr1];
        arr[indexArr1] = arr[indexArr2];
        arr[indexArr2] = swapTemp;
    }


    public static void print(Student[] arr) {
        for (Student student : arr) {
            System.out.println(student);
        }
    }
}

