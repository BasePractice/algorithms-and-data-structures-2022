package mirea.practice.s21k0723.p4.task3;

import java.util.List;

public enum Smartphones {
    Xiaomi10T(20000),
    IPhone13(60000),
    IPhone11Pro(90000),
    GooglePixel4a5G(45000);
    int price;
    Smartphones(int price) {
        this.price = price;
    }

    public static void showSmartphones() {
        for (Smartphones x: Smartphones.values()) {
            System.out.println(x);
        }
    }

    public static void getSmartphones(List<String> list) {
        for (Smartphones x: Smartphones.values()) {
            list.add(x.name());
        }
    }
}