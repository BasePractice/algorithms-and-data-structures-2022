package ru.mirea.practice.task3;

import java.util.HashMap;
import java.util.Scanner;

public class Shop {
    private enum Catalogs {
        Sweaters,
        Hats,
        Shoes,
        Pants
    }

    private final HashMap<String, Integer> sweatersCatalog;
    private final HashMap<String, Integer> hatsCatalog;
    private final HashMap<String, Integer> shoesCatalog;
    private final HashMap<String, Integer> pantsCatalog;
    private final HashMap<String, Integer> shoppingCart;
    private final HashMap<String, String> users;


    public Shop() {
        shoppingCart = new HashMap<>();
        sweatersCatalog = new HashMap<>();
        sweatersCatalog.put("Pullover", 10);
        sweatersCatalog.put("Cardigan", 10);
        sweatersCatalog.put("Polo neck", 10);
        sweatersCatalog.put("Sleeveless pullover", 10);
        hatsCatalog = new HashMap<>();
        hatsCatalog.put("Cap", 20);
        hatsCatalog.put("Cylinder", 5);
        hatsCatalog.put("Hat", 10);
        shoesCatalog = new HashMap<>();
        shoesCatalog.put("Sneaker", 200);
        shoesCatalog.put("Boots", 100);
        shoesCatalog.put("Crocs", 150);
        pantsCatalog = new HashMap<>();
        pantsCatalog.put("Jeans", 15);
        pantsCatalog.put("Sport pants", 15);
        pantsCatalog.put("Shorts", 20);

        users = new HashMap<>();


    }

    public void shopAction() {
        Scanner in = new Scanner(System.in);
        registration();
        if(logIn()) {
            while (true) {
                System.out.println("Enter search to return to catalog or buy if you want to buy item");
                String Answer = null;
                if(in.hasNext()) {
                    Answer = in.next();
                }

                assert Answer != null;
                if(Answer.equals("buy")) {
                    buy();
                    break;
                } else if(Answer.equals("search")) {
                    search();
                } else {
                    System.out.println("Wrong input");
                }
            }


        } else {
            System.out.println("Wrong login");

        }
    }

    private void registration() {
        Scanner in = new Scanner(System.in);
        System.out.println("Registration");
        System.out.println("Enter login: ");
        String login = in.next();
        System.out.println("Enter password: ");
        String password = in.next();
        users.put(login, password);


    }

    private boolean logIn() {
        Scanner in = new Scanner(System.in);
        System.out.println("Login");
        System.out.println("Enter login: ");
        String login = in.next();
        System.out.println("Enter password: ");
        String password = in.next();
        for (HashMap.Entry<String, String> entry : users.entrySet()) {
            if(entry.getKey().equals(login) && entry.getValue().equals(password)) {
                System.out.println("Success");
                return true;
            }
        }

        return false;


    }

    private void search() {
        Scanner in = new Scanner(System.in);
        Catalogs[] types = Catalogs.values();
        System.out.println("Choose catalog");
        int i = 0;
        for (Catalogs s : types) {
            i++;
            System.out.println(i + ". " + s);
        }
        int Answer = in.nextInt();
        System.out.println("Choose item and Number of it");
        switch (Answer) {
            case 1: {
                searchInCatalog(sweatersCatalog);
            }
            case 2: {
                searchInCatalog(hatsCatalog);
            }
            case 3: {
                searchInCatalog(shoesCatalog);
            }
            case 4: {
                searchInCatalog(pantsCatalog);
            }
        }


    }

    private void searchInCatalog(HashMap<String, Integer> catalog) {
        Scanner in = new Scanner(System.in);
        int amount = 0, item = 0;
        int i = 0;
        for (HashMap.Entry<String, Integer> entry : shoesCatalog.entrySet()) {
            i++;
            System.out.println(i + ". " + entry);
        }
        if(in.hasNextInt()) {
            item = in.nextInt();
            amount = in.nextInt();
        }
        i = 0;
        for (HashMap.Entry<String, Integer> entry : catalog.entrySet()) {
            i++;
            if(i == item) {
                addToShoppingCart(entry.getKey(), amount);
            }


        }
    }

    private void addToShoppingCart(String cloth, Integer amount) {
        shoppingCart.put(cloth, amount);
    }

    private void buy() {
        if(!shoppingCart.isEmpty()) {
            for (HashMap.Entry<String, Integer> entry : shoppingCart.entrySet()) {
                System.out.println("You get " + entry);
            }

        } else {
            System.out.println("You didn't buy anything");
        }


    }


}
