package ru.mirea.workfour.task3;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private static final List<Product> basket = new ArrayList<>();

    public void getCategory(Categories category, Product[] arr) {
        for (Product product : arr) {
            if (product.getCategory() == category) {
                System.out.println(product);
            }
        }
    }

    public void addProduct(int a,  Product[] arr, Categories category) {
        int b = 0;
        for (Product product : arr) {
            if (product.getCategory() == category) {
                b++;
                if (b == a) {
                    basket.add(product);
                }
            }
        }
    }

    public void printCategories() {
        System.out.println("Доступные категории:");
        for (Categories category : Categories.values()) {
            System.out.println(category);
        }
    }

    public void getBasket() {
        for (Product product: basket) {
            System.out.println(product);
        }
    }

    public double finalPrice() {
        double a = 0;
        for (Product product: basket) {
            a += product.getPrice();
        }
        return a;
    }
}
