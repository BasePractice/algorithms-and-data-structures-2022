package mirea.practice.s21k0723.p4.task3;

import java.util.List;

public enum Laptops {
    Macbook(200000),
    Xiaomi(100000),
    Acer(150000);
    int price;
    Laptops(int price) {
        this.price = price;
    }

    public static void showLaptops() {
        for (Laptops x: Laptops.values()) {
            System.out.println(x);
        }
    }

    public static void getLaptops(List<String> list) {
        for (Laptops x: Laptops.values()) {
            list.add(x.name());
        }
    }
}
