package ru.mirea.practice.Ex3;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static Map<String, User> users = Map.of("Alfred",new User("Alfred", "12345"));
    public static User currentUser;
    public static boolean Authentication() {
        System.out.println("Enter login: ");
        Scanner sc = new Scanner(System.in);
        String inputLogin = sc.next();
        if (!users.containsKey(inputLogin)) {
            System.out.println("No such user. Please register");
            return false;
        } else {
            System.out.println("Enter password: ");
            int inputHashPassword = sc.next().hashCode();
            if (users.get(inputLogin).password == inputHashPassword) {
                System.out.println("Authorization successful");
                currentUser = users.get(inputLogin);
                return true;
            } else {
                System.out.println("Wrong password");
                return false;
            }
        }
    }

    public static void main(String[] args) {
        boolean successful = false;
        while (!successful) {
            successful = Authentication();
        }
        Scanner sc = new Scanner(System.in);
        String userInput = "";
        ProductType type = null;
        boolean toPayment = false;
        while (!toPayment) {
            System.out.println("Choose a catalog by printing it's name");
            System.out.println("or print exit to move to payment");
            for (ProductType productType: ProductType.values()) {
                System.out.println(productType);
            }

            while (true) {
                userInput = sc.next().toUpperCase();
                if (userInput.equals("E") || userInput.equals("EXIT")) {
                    toPayment = true;
                    break;
                }
                try {
                    type = ProductType.valueOf(userInput);
                } catch (IllegalArgumentException e) {
                    System.out.println("Wrong catalog name");
                    System.out.println("Try again");
                    continue;
                }
                break;
            }
            if (toPayment) {
                break;
            }
            System.out.println("Goods in catalog: ");
            ArrayList<Goods> catalogProducts = Goods.getProductsOfType(type);
            for (Goods product: catalogProducts) {
                System.out.println(product + " " + product.getPrice());
            }
            System.out.println("Choose a product to add it to the cart by printing it's name");
            System.out.println("or print exit to move to payment");
            Goods product = null;
            while (true) {
                userInput = sc.next().toUpperCase();
                if (userInput.equals("E") || userInput.equals("EXIT")) {
                    toPayment = true;
                    break;
                }
                try {
                    product = Goods.valueOf(userInput);
                } catch (IllegalArgumentException e) {
                    System.out.println("Wrong product name");
                    System.out.println("Try again");
                    continue;
                }
                break;
            }

            currentUser.addToCart(product);
            System.out.println(product + " added to a cart");
            System.out.println("Sum cost of products in the cart: " + currentUser.getCartSum());
            System.out.println();
        }
        System.out.println("Products in cart:");
        for (Goods position: currentUser.getCart()) {
            System.out.println(position + " " + position.getPrice());
        }
        System.out.println("Summary: " + currentUser.getCartSum());
        System.out.println();
        System.out.println("Confirm the purchase?");
        userInput = sc.next().toLowerCase();
        if (userInput.equals("yes") || userInput.equals("y")) {
            System.out.println("Purchase successful");
        } else {
            System.out.println("Purchase cancelled");
        }
    }
}