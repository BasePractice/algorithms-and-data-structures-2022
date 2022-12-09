package ru.mirea.practice.s21k0627.task2;

import java.util.Comparator;

public class SortingStudentByGPA implements Comparator<SortingStudentByGPA> {
    private int id;
    private int score;

    public SortingStudentByGPA(int id, int score) {
        this.id = id;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student ID " + id + ", score " + score;
    }

    @Override
    public int compare(SortingStudentByGPA o1, SortingStudentByGPA o2) {
        if (o1.getScore() == o2.getScore()) {
            return 0;
        }
        if (o1.getScore() < o2.getScore()) {
            return 0;
        }
        return -1;
    }
}
