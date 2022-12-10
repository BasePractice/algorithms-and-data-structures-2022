package ru.mirea.practice.task2;

import ru.mirea.practice.task1.Student;

import java.util.Comparator;

public class SortingStudents implements Comparator<Student> {
    private Student[] lists;
    private int listLength;


    public SortingStudents(int length) {
        this.listLength = length;
        lists = new Student[length];
    }

    public Student[] getLists() {
        return lists;
    }


    public int getListLength() {
        return listLength;
    }

    public void setListLength(int listLength) {
        this.listLength = listLength;
    }

    public void quickSort(int begin, int end) {
        if (begin < end) {
            int partInd = partition(begin, end);

            quickSort(begin, partInd - 1);
            quickSort(partInd + 1, end);
        }
    }

    private int partition(int start, int end) {
        Student piv = lists[end];
        int i = start - 1;

        for (int j = start; j < end; j++) {
            if (compare(lists[j], piv) > 0) {
                i++;
                swap(i, j);
            }
        }
        swap(i + 1, end);
        return i + 1;
    }

    public void swap(int indexStudentA, int indexStudentB) {
        Student swapTemp = lists[indexStudentA];
        lists[indexStudentA] = lists[indexStudentB];
        lists[indexStudentB] = swapTemp;

    }

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getGpa() - o2.getGpa();
    }

    public void setLists(Student[] lists) {
        this.lists = lists;
    }
}
