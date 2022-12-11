package ru.mirea.practice.task3;

import java.util.Scanner;

abstract class Test {
    public static void main(String[] args) {
        User person = new User("MikolaAYE", "byzon");
        try (Scanner scan = new Scanner(System.in)) {
            if (person.checkUser(scan)) {
                Catalogs[] values = Catalogs.values();
                for (int i = 0; i < values.length; i++) {
                    Catalogs catalogs = values[i];
                    System.out.print(i + 1 + ") " + catalogs.name() + "\n");
                }
                int index = 0;
                boolean work = true;
                Products[] arr = {new Products(" ", 0),
                                  new Products(" ", 0),
                                  new Products(" ", 0)
                };
                while (work) {
                    System.out.print("\nWhat catalogue do u want to choose? (1, 2, 3, 0): ");
                    System.out.println();
                    index = scan.nextInt();
                    switch (index) {
                        case 1:
                            Catalogs first = Catalogs.MEAT;
                            System.out.print(first);
                            System.out.println("Choose product (1, 2, 3): ");
                            int choice1 = scan.nextInt();
                            arr[0] = first.getProducts()[choice1 - 1];
                            break;
                        case 2:
                            Catalogs second = Catalogs.DRINKS;
                            System.out.print(second);
                            System.out.println("Choose product (1, 2, 3): ");
                            int choice2 = scan.nextInt();
                            arr[1] = second.getProducts()[choice2 - 1];
                            break;
                        case 3:
                            Catalogs third = Catalogs.VEGETABLES;
                            System.out.print(third);
                            System.out.println("Choose product (1, 2, 3): ");
                            int choice3 = scan.nextInt();
                            arr[2] = third.getProducts()[choice3 - 1];
                            break;
                        case 0:
                            work = false;
                            break;
                        default:
                            System.out.print("Wrong meaning");
                            break;
                    }
                }
                int counter = 0;
                for (Products products : arr) {
                    counter += products.getPrice();
                }
                System.out.println("Purchase costs: " + counter);
            }
        }
    }
}
