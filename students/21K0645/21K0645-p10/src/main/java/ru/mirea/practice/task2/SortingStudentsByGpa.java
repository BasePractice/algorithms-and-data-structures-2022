package ru.mirea.practice.task2;

/* Напишите класс SortingStudentsByGPA (может у вас называться Tester
или Main, так как содержит функцию main()) создайте поле как массив
объектов Student с названием iDNumber, вы можете использовать как массив,
так и и ArrayList или TreeSet для хранения данных о студентах
Добавьте методы класса: 1) заполнения массива setArray() 2) метод для
сортировки по среднему баллу студентов quicksort() который реализует
интерфейс Comparator таким образом, чтобы он сортировал студентов с их
итоговым баллом в порядке убывания. В качестве алгоритма сортировки
использовать методы сортировок: слиянием и быструю сортировку (добавьте в
класс еще один метод). 3)метод для вывода массива студентов outArray()
4)Добавьте в класс возможность сортировать список студентов по другому полю */

import java.util.ArrayList;
import java.util.List;

public final class SortingStudentsByGpa {

    private SortingStudentsByGpa() {
    }

    public static void setArray(List<Student> array) {
        array.add(new Student("Name1", "Surname1", "Speciality1", 1, 1, 1, 5.0));
        array.add(new Student("Name2", "Surname2", "Speciality1", 3, 1, 5, 13));
        array.add(new Student("Name3", "Surname3", "Speciality1", 2, 2, 3, 4));
        array.add(new Student("Name4", "Surname4", "Speciality1", 1, 2, 6, 10));
        array.add(new Student("Name5", "Surname5", "Speciality1", 5, 2, 9, 5));
    }

    public static void quicksort(List<Student> sortArr, int order) {
        order = order > 0 ? 1 : -1;
        sort(sortArr, 0, sortArr.size() - 1, order, new GnaComparator());
    }

    private static void sort(List<Student> sortArr, int low, int high, int order, GnaComparator comparator) {

        if (sortArr.isEmpty() || low >= high) {
            return;
        }

        int middle = low + (high - low) / 2;
        Student border = sortArr.get(middle);

        int i = low;
        int j = high;
        while (i <= j) {
            while (comparator.compare(sortArr.get(i), border) * order > 0) {
                i++;
            }
            while (comparator.compare(sortArr.get(j), border) * order > 0) {
                j--;
            }
            if (i <= j) {
                Student temp = sortArr.get(i);
                sortArr.set(i, sortArr.get(j));
                sortArr.set(j, temp);
                i++;
                j--;
            }
        }

        if (low < j) {
            sort(sortArr, low, j, order, comparator);
        }
        if (high > i) {
            sort(sortArr, i, high, order, comparator);
        }
    }

    public static void main(String[] args) {

        List<Student> idNumber = new ArrayList<>();
        setArray(idNumber);
        System.out.println(idNumber);

        quicksort(idNumber, -1);
        System.out.println(idNumber);
    }
}
