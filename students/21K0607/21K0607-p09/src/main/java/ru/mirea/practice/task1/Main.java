package ru.mirea.practice.task1;

public abstract class Main {
    public static void main(String[] args) {
        InsertionSort sortingByIdNumber = new InsertionSort(4);
        Student student1 = new Student("test", 1234, 21341);
        Student student2 = new Student("test1", 321654, 4131);
        Student student3 = new Student("test2", 96, 111);
        Student student4 = new Student("test3", 60, 116);
        sortingByIdNumber.setStudentsList(new Student[]{student1, student2, student3, student4});
        sortingByIdNumber.insertionSort();
    }
}
