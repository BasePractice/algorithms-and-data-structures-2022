package ru.mirea.workfour.task3;

import java.util.Scanner;

public final class Main {
    private Main() {
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите логин: ");
            String login = sc.next();
            System.out.println("Введите пароль: ");
            String password = sc.next();
            User test = new User("John", "123");
            if (test.userAuthorize(login, password)) {
                Product[] products = new Product[10];
                products[0] = new Product(20, Categories.FRUITS, "apple");
                products[1] = new Product(30, Categories.FRUITS, "grape");
                products[2] = new Product(15, Categories.FRUITS, "banana");
                products[3] = new Product(50, Categories.FRUITS, "orange");
                products[4] = new Product(10, Categories.VEGETABLES, "potato");
                products[5] = new Product(35, Categories.VEGETABLES, "carrot");
                products[6] = new Product(40, Categories.VEGETABLES, "tomato");
                products[7] = new Product(20, Categories.GRAINS, "rise");
                products[8] = new Product(25, Categories.GRAINS, "buckwheat");
                products[9] = new Product(45, Categories.GRAINS, "oatmeal");
                Shop shop = new Shop();
                shop.printCategories();
                int next = 1;
                while (next == 1) {
                    System.out.println("Выберете категорию товаров(1-3)");
                    int category = sc.nextInt();
                    int a;
                    switch (category) {
                        case 1:
                            shop.getCategory(Categories.FRUITS, products);
                            System.out.println("Напишите номер товара, который хотите добавить в корзину:");
                            a = sc.nextInt();
                            shop.addProduct(a, products, Categories.FRUITS);
                            break;
                        case 2:
                            shop.getCategory(Categories.VEGETABLES, products);
                            System.out.println("Напишите номер товара, который хотите добавить в корзину:");
                            a = sc.nextInt();
                            shop.addProduct(a, products, Categories.VEGETABLES);
                            break;
                        case 3:
                            shop.getCategory(Categories.GRAINS, products);
                            System.out.println("Напишите номер товара, который хотите добавить в корзину:");
                            a = sc.nextInt();
                            shop.addProduct(a, products, Categories.GRAINS);
                            break;
                        default:
                            break;
                    }
                    System.out.println("Продолжить покупки?(y - 1/n - 0)");
                    next = sc.nextInt();
                    System.out.println(next);
                }
                System.out.println("Ваша корзина:");
                shop.getBasket();
                System.out.println("Общая стоимость:");
                System.out.println(shop.finalPrice());
            }
        }
    }
}
