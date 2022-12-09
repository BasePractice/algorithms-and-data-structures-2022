package mirea.practice.s21k0723.p4.task3;

import java.util.List;

public enum Cars {
    Hyundai(300000),
    Mersedes(400000),
    Niva(200000);

    int price;
    Cars(int price) {
        this.price = price;
    }

    public static void showCars() {
        for (Cars x: Cars.values()) {
            System.out.println(x);
        }
    }

    public static void getCar(List<String> list) {
        for (Cars x: Cars.values()) {
            list.add(x.name());
        }
    }
}
