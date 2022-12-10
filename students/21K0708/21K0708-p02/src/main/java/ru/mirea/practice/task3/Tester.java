package ru.mirea.practice.task3;

import java.util.List;

public class Tester {
    private int size;
    private List<Circle> circleArrayList;

    public Tester(int size, List<Circle> circleArrayList) {
        this.size = size;
        this.circleArrayList = circleArrayList;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<Circle> getCircleArrayList() {
        return circleArrayList;
    }

    public void setCircleArrayList(List<Circle> circleArrayList) {
        this.circleArrayList = circleArrayList;
    }
}