package ru.mirea.practice.task2to3;

import java.util.Arrays;

public abstract class SortingStudentByGpa {
    private static Student[] idNumbers;

    public static Student[] getIdNumbers() {
        return idNumbers;
    }

    public static void setArray(Student[] students) {
        idNumbers = students;
    }

    public static void quickSort(int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(begin, end);

            quickSort(begin, partitionIndex - 1);
            quickSort(partitionIndex + 1, end);
        }
    }

    private static int partition(int begin, int end) {
        Student pivot = idNumbers[end];
        int i = begin - 1;

        for (int j = begin; j < end; j++) {
            if (compare(idNumbers[j], pivot) > 0) {
                i++;
                swap(i, j);
            }
        }
        swap(i + 1, end);
        return i + 1;
    }

    private static void swap(int indexStudent1, int indexStudent2) {
        Student swapTemp = idNumbers[indexStudent1];
        idNumbers[indexStudent1] = idNumbers[indexStudent2];
        idNumbers[indexStudent2] = swapTemp;

    }


    public static int compare(Student o1, Student o2) {
        return o1.getGpa() - o2.getGpa();
    }

    //3 задание: сортировка слиянием
    public static void mergeSort(Student[] students, int length) {
        if (length < 2) {
            return;
        }
        int mid = length / 2;
        Student[] left = new Student[mid];
        Student[] right = new Student[length - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = students[i];
        }
        for (int i = mid; i < length; i++) {
            right[i - mid] = students[i];
        }
        mergeSort(left, mid);
        mergeSort(right, length - mid);

        merge(students, left, right, mid, length - mid);
    }


    private static void merge(Student[] students, Student[] left, Student[] right, int leftI, int rightI) {

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < leftI && j < rightI) {
            if (compare(left[i], right[j]) <= 0) {
                students[k++] = left[i++];
            } else {
                students[k++] = right[j++];
            }
        }
        while (i < leftI) {
            students[k++] = left[i++];
        }
        while (j < rightI) {
            students[k++] = right[j++];
        }
    }

    public static void outArray() {
        System.out.println(Arrays.toString(idNumbers));
    }

    public static void main(String[] args) {
        Student student1 = new Student("john", "fed", "Computer Science", "KVBO", 1, 1242);
        Student student2 = new Student("Rick", "f", "Science", "KVBO", 2, 8563);
        Student student3 = new Student("Morty", "f", "Bio Technology", "KVBO", 3, 1294);
        Student student4 = new Student("Jerry", "f", "Chemical", "KVBO", 4, 3295);
        setArray(new Student[]{student1, student2, student3, student4});
        System.out.println("before quick sort");
        quickSort(0, 3);
        outArray();
        System.out.println("After:");
        outArray();
        setArray(new Student[]{student1, student2, student3, student4});
        System.out.println("before merge sort");
        outArray();
        System.out.println("After");
        mergeSort(getIdNumbers(), 4);
        outArray();

    }
}
