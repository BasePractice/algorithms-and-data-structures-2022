package ru.mirea.practice.s21k0647.zad3;

import java.util.Scanner;

public final class Market {
    private Market() {

    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            Users users = new Users();
            String ss = "avtoriz";
            String string = "no";
            User user1 = new User();
            String catalog = "";
            while ("no".equals(string)) {
                if ("avtoriz".equals(ss)) {
                    user1 = login(user1, users, sc);
                    System.out.println("Komand: avtoriz, inCatalog, add, buy ");
                    ss = sc.nextLine();
                }
                if ("inCatalog".equals(ss) || "add".equals(ss)) {

                    if ("add".equals(ss) != true) {
                        Catalog.catalogAll();
                        System.out.println("Select a folder");
                        catalog = sc.nextLine();
                        podCatalog(catalog);
                        System.out.println("Komand: avtoriz, inCatalog, add, buy");
                        ss = sc.nextLine();
                    }
                    if ("add".equals(ss)) {
                        addProduct(catalog, user1, users, sc);
                        System.out.println("Komand: avtoriz, inCatalog, add, buy");
                        ss = sc.nextLine();
                    }
                }
                if ("buy".equals(ss)) {
                    buy(user1, sc);
                    System.out.println("Komand: avtoriz, inCatalog, add, buy");
                    ss = sc.nextLine();
                    System.out.println("Exit?");
                    string = sc.nextLine();

                }
            }
            users.setUsers();
        }
    }

    public static User login(User user1, Users users, Scanner sc) {

        System.out.println("Registration or login");
        String login = sc.nextLine();
        System.out.println("Enter the username");
        String username = sc.nextLine();
        System.out.println("Enter the password");
        String password = sc.nextLine();
        user1 = new User(username, password);
        if ("login".equals(login)) {
            users.userSearch(user1);
        } else {
            users.userAdd(user1);
        }

        return user1;
    }

    public static void buy(User user1, Scanner sc) {
        System.out.println("Would you like to see the shopping cart");
        String s2 = sc.next();
        if ("yes".equals(s2)) {
            user1.basketDisplay();
        } else {
            user1.basketSumm();
        }

    }

    public static void addProduct(String catalog, User user1, Users users, Scanner sc) {

        System.out.println("Enter the product name: ");
        String s = sc.next();
        Product product = new Product();

        switch (catalog) {
            case "CLOTHES":
                product = Clothes.cloSearch(s);
                break;
            case "SHOES":
                product = Shoes.search(s);
                break;
            case "ACCESSORYS":
                product = Accessorys.search(s);
                break;
            case "ELECTRONICS":
                product = Electronics.search(s);
                break;
            case "TOYS":
                product = Toys.search(s);
                break;
            case "SPORT":
                product = Sport.search(s);
                break;
            case "AUTO":
                product = Auto.search(s);
                break;
            default:
                System.out.println("There is no such directory");
                break;
        }

        podCatalog(catalog);
        users.userAddBasket(user1, product);
    }

    public static void podCatalog(String catalog) {
        switch (catalog) {
            case "CLOTHES":
                Clothes.cloAll();
                break;
            case "SHOES" :
                Shoes.shoAll();
                break;
            case "ACCESSORYS" :
                Accessorys.accAll();
                break;
            case "ELECTRONICS" :
                Electronics.electroAll();
                break;
            case "TOYS" :
                Toys.toyAll();
                break;
            case "SPORT" :
                Sport.sportAll();
                break;
            case "AUTO" :
                Auto.autoAll();
                break;
            default :
                System.out.println("There is no such directory");
                break;
        }

    }

}
