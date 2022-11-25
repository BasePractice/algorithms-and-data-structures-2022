package ru.mirea.practice.work3;

import java.util.ArrayList;
import java.util.List;

abstract class Main {
    public static List<Work> mergeSort(List<Work> newList) {
        if (newList == null) {
            return newList;
        }
        if (newList.size() < 2) {
            return newList;
        }

        List<Work> left = new ArrayList<>(newList.size() / 2);
        List<Work> right = new ArrayList<>(newList.size() - newList.size() / 2);

        for (int i = 0; i < newList.size() / 2; i++) {
            left.add(i, newList.get(i));
        }

        for (int i = newList.size() / 2; i < newList.size(); i++) {
            int j = i - newList.size() / 2;
            right.add(j, newList.get(i));
        }
        mergeSort(left);
        mergeSort(right);

        for (int i = 0; i < left.size(); i++) {
            for (int j = 0; j < right.size(); j++) {
                if (left.get(i).getMark() > right.get(j).getMark()) {
                    Work buff = new Work(left.get(i).getMark());
                    left.set(i, right.get(j));
                    right.set(j, buff);
                }
            }
        }
        int k = 0;
        for (int i = 0; i < left.size(); i++) {
            newList.set(i, left.get(i));
            k++;
        }
        for (int i = k; i < newList.size(); i++) {
            int j = i - k;
            newList.set(i, right.get(j));
        }
        return newList;
    }

    public static void main(String[] args) {
        List<Work> list1 = new ArrayList<>(3);
        list1.add(new Work(27));
        list1.add(new Work(132));
        list1.add(new Work(1));

        List<Work> list2 = new ArrayList<>(3);
        list2.add(new Work(100));
        list2.add(new Work(23));
        list2.add(new Work(11));
    }
}
