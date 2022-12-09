package ru.mirea.practice4.task3;

import java.util.Scanner;

abstract class IS {


    static Product bread = new Product("Хлеб", 34.0, 4.3);
    static Product buscuit = new Product("Бисквит", 60.0, 5.0);
    static Product cookies = new Product("Печеньки", 75.0, 4.9);
    static Product milk = new Product("Молоко", 123.0, 4.3);
    static Product kefir = new Product("Кефир", 86.0, 4.2);
    static Product curd = new Product("Творог", 75.0, 5.0);
    static Product[] Bakery = {bread, buscuit, cookies};
    static Category bakery = new Category("Хлебобулочные изделия", Bakery);
    static Product[] Diary = {milk, kefir, curd};
    static Category diary = new Category("Молочные изделия", Diary);
    static Category[] all = {bakery, diary};
    static Product[] card;
    static User client;

    public static void getMenu() {
        System.out.println("\n Меню");
        System.out.println("1.Категории товаров");
        System.out.println("2.Корзина");
        System.out.println("3.Оплатить");
        System.out.println("0.Выход");
        try (Scanner sc = new Scanner(System.in)) {

            int number = sc.nextInt();
            switch (number) {
                case 1: {
                    getCategory(all);
                    break;
                }
                case 2: {
                    getBasket(card);
                    break;
                }
                case 3: {
                    buy();
                    break;
                }
                case 0: {
                    break;
                }
                default:
            }
        }
    }

    public static void buy() {
        Basket cards = new Basket(card);
        client.purchased = cards;
        System.out.println("Товарный чек");
        for (int i = 0; i < client.purchased.purchased.length; ++i) {
            if (client.purchased.purchased[i] == null) {
                break;
            }
            System.out.println((i + 1) + ". " + client.purchased.purchased[i].nameProduct + " ------- "
                    + client.purchased.purchased[i].cost + " ------- " + client.purchased.purchased[i].rating);
        }
        double gc = getCash(client.purchased.purchased);
        System.out.print("Общая сумма покупок составляет -------" + gc);

    }

    public static double getCash(Product[] p) {
        double cash = 0.0;
        for (Product product : p) {
            if (product == null) {
                break;
            }
            cash += product.cost;
        }
        return cash;
    }

    public static void getCategory(Category[] c) {
        for (int i = 0; i < c.length; ++i) {
            System.out.println("№" + (i + 1) + " " + c[i].nameCategory);
        }
        System.out.println("0.Назад");
        try (Scanner sc = new Scanner(System.in)) {
            int number = sc.nextInt();
            if (number == 0) {
                getMenu();
            } else {
                seeProduct(all[number - 1]);
            }
            sc.close();
        }

    }

    public static void getBasket(Product[] b) {
        for (int i = 0; i < b.length; ++i) {
            if (b[i] == null) {
                break;
            }
            System.out.println((i + 1) + ". " + b[i].nameProduct + " ------- "
                    + b[i].cost + " ------- " + b[i].rating);
        }
        System.out.println("0.Назад");
        int number = 2;
        if (number == 0) {
            getMenu();
        }
    }

    public static void seeProduct(Category cat) {
        for (int i = 0; i < cat.products.length; ++i) {
            System.out.println((i + 1) + ". " + cat.products[i].nameProduct + " ------- "
                    + cat.products[i].cost + " ------- " + cat.products[i].rating);
        }
        System.out.println("0.Назад");

        int number = 3;
        if (number == 0) {
            getCategory(all);
        } else {
            buyProduct(cat.products[number - 1]);
        }
    }

    private static void buyProduct(Product p) {
        System.out.println("Продукт " + p.nameProduct + " за " + p.cost + " был добавлен в вашу корзину");
        for (int i = 0; i < card.length; ++i) {
            if (card[i] == null) {
                card[i] = p;
                break;
            } else {
                if (i + 1 == card.length && card[i] == null) {
                    System.out.println("Корзина заполнена");
                    break;
                }
            }
        }

        getCategory(all);
    }

    public static void main(String[] args) {
        client = new User("123", "123");

        try (Scanner scanner = new Scanner(System.in)) {
            card = new Product[10];
            System.out.println("Авторизация \n Введите логин и пароль пользователя:");
            String login = scanner.nextLine();
            String password = scanner.nextLine();
            scanner.close();
            if (!client.isAuth(login, password)) {
                getMenu();
            }

        }
    }
}

