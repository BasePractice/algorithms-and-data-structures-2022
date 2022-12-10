package ru.mirea.practice.task4;


public class Bubble {
    private Student[] arr;

    public Bubble(Student[] arr) {
        this.arr = arr;
    }

    public Student[] getArr() {
        return arr;
    }

    public void sort() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i].compareTo(arr[j].getGpa()) < 0) {
                    Student temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

}
