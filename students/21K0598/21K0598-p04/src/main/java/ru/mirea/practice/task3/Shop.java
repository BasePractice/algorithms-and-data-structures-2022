package ru.mirea.practice.task3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Shop {
    private enum Catalogs {
        Smarphones,
        Laptops,
        Computers,
        Tablets
    }

    private final Map<String, Integer> smartphonesCatalog;
    private final Map<String, Integer> laptopsCatalog;
    private final Map<String, Integer> computersCatalog;
    private final Map<String, Integer> tabletsCatalog;
    private final Map<String, Integer> shoppingCart;
    private final Map<String, String> users;


    public Shop() {
        shoppingCart = new HashMap<>();
        smartphonesCatalog = new HashMap<>();
        smartphonesCatalog.put("Pullover", 10);
        smartphonesCatalog.put("Cardigan", 10);
        smartphonesCatalog.put("Polo neck", 10);
        smartphonesCatalog.put("Sleeveless pullover", 10);
        laptopsCatalog = new HashMap<>();
        laptopsCatalog.put("Cap", 20);
        laptopsCatalog.put("Cylinder", 5);
        laptopsCatalog.put("Hat", 10);
        computersCatalog = new HashMap<>();
        computersCatalog.put("Sneaker", 200);
        computersCatalog.put("Boots", 100);
        computersCatalog.put("Crocs", 150);
        tabletsCatalog = new HashMap<>();
        tabletsCatalog.put("Jeans", 15);
        tabletsCatalog.put("Sport pants", 15);
        tabletsCatalog.put("Shorts", 20);
        users = new HashMap<>();
    }

    public void shopAction() {
        try (Scanner in = new Scanner(System.in)) {
            registration();
            if (logIn()) {
                while (true) {
                    System.out.println("Enter search to return to catalog or buy if you want to buy item");
                    String answer = null;
                    if (in.hasNext()) {
                        answer = in.next();
                    }

                    assert answer != null;
                    if ("buy".equals(answer)) {
                        buy();
                        break;
                    } else if ("search".equals(answer)) {
                        search();
                    } else {
                        System.out.println("Wrong input");
                    }
                }


            } else {
                System.out.println("Wrong login");

            }
        }

    }

    private void registration() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Registration");
            System.out.println("Enter login: ");
            String login = sc.next();
            System.out.println("Enter password: ");
            String password = sc.next();
            users.put(login, password);
        }

    }

    private boolean logIn() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Login");
            System.out.println("Enter login: ");
            String login = sc.next();
            System.out.println("Enter password: ");
            String password = sc.next();
            for (HashMap.Entry<String, String> entry : users.entrySet()) {
                if (entry.getKey().equals(login) && entry.getValue().equals(password)) {
                    System.out.println("Success");
                    return true;
                }
            }
            return false;
        }

    }

    private void search() {
        try (Scanner in = new Scanner(System.in)) {
            Catalogs[] types = Catalogs.values();
            System.out.println("Choose catalog");
            int i = 0;
            for (Catalogs s : types) {
                i++;
                System.out.println(i + ". " + s);
            }
            int answer = in.nextInt();
            System.out.println("Choose item and Number of it");
            switch (answer) {
                case 1: {
                    searchInCatalog(smartphonesCatalog);
                    break;
                }
                case 2: {
                    searchInCatalog(laptopsCatalog);
                    break;
                }
                case 3: {
                    searchInCatalog(computersCatalog);
                    break;
                }
                case 4: {
                    searchInCatalog(tabletsCatalog);
                    break;
                }
                default: {
                    break;
                }
            }
        }

    }

    private void searchInCatalog(Map<String, Integer> catalog) {
        try (Scanner in = new Scanner(System.in)) {
            int amount = 0;
            int item = 0;
            int i = 0;
            for (HashMap.Entry<String, Integer> entry : computersCatalog.entrySet()) {
                i++;
                System.out.println(i + ". " + entry);
            }
            if (in.hasNextInt()) {
                item = in.nextInt();
                amount = in.nextInt();
            }
            i = 0;
            for (HashMap.Entry<String, Integer> entry : catalog.entrySet()) {
                i++;
                if (i == item) {
                    addToShoppingCart(entry.getKey(), amount);
                }
            }
        }
    }

    private void addToShoppingCart(String cloth, Integer amount) {
        shoppingCart.put(cloth, amount);
    }

    private void buy() {
        if (!shoppingCart.isEmpty()) {
            for (HashMap.Entry<String, Integer> entry : shoppingCart.entrySet()) {
                System.out.println("You get " + entry);
            }
        } else {
            System.out.println("You didn't buy anything");
        }
    }
}
