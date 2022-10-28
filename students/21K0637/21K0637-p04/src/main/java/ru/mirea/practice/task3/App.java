package ru.mirea.practice.task3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User userIvan = new User("Ivan", "pswd");
        if (!userIvan.checkUser(scanner)) {
            System.out.println("Пользователь не найден");
            return;
        }


        System.out.println("________");
        Catalog.getCatalog();

        userIvan.basket.addProduct(Catalog.BAKERY.getProduct(1));
        userIvan.basket.addProduct(Catalog.DAIRY.getProduct(2));
        userIvan.basket.addProduct(Catalog.DAIRY.getProduct(2));
        userIvan.basket.deleteProduct(Catalog.DAIRY.getProduct(2));
        userIvan.basket.displayProducts();
    }
}
