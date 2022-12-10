package ru.mirea.practice.task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.List;

abstract class Tester {
    public static void main(String[] args) {
        Random rand = new Random();
        addCircle(new Circle(10, 12));
        addCircle(new Circle());
        addCircle(
                new Circle(
                    new Point(123, 456),
                    rand.nextInt(35)
                )
        );
        addCircle(new Circle(123, 654,
                rand.nextInt(35)));
        System.out.println(circles);

        System.out.printf(
                "Индекс наименьшего: %d\n"
                + "Индекс наибольшего: %d\n\n",
                findSmallest(circles),
                findBiggest(circles)
        );

        sortArr(circles);
        for (Circle i : circles) {
            System.out.println(i);
        }
    }

    public static void addCircle(Circle nc) {
        circles.add(nc);
        circles_size = circles.size();
    }

    static List<Circle> circles = new ArrayList<>();
    //Kill array list
    static int circles_size = 0;

    static int findSmallest(List<Circle> awawa) {
        Circle c = awawa.get(0);
        int idx = 0;
        for (Circle i : awawa) {
            if (c.largerThan(i)) {
                c = i;
                idx = awawa.indexOf(i);
            }
        }
        return idx;
    }

    static int findBiggest(List<Circle> awawa) {
        Circle c = awawa.get(0);
        int idx = 0;
        for (Circle i : awawa) {
            if (c.smallerThan(i)) {
                c = i;
                idx = awawa.indexOf(i);
            }
        }
        return idx;
    }

    static void sortArr(List<Circle> aww) {
        aww.sort(new Comparator<Circle>() {
            @Override
            public int compare(Circle circle, Circle t1) {
                if (circle.r > t1.r) {
                    return 1;
                } else if (circle.r < t1.r) {
                    return -1;
                }
                return 0;
            }
        });
    }
}
