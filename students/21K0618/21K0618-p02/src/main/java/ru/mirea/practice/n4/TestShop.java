package ru.mirea.practice.n4;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

abstract class TestShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            Shop eldorado = new Shop();
            //Комбинация для входа в режим Администратора Sobaka@Kot^.^
            //Для выключения системы введите SystemGoToAutoSleepAndOff
            System.out.println("Добро пожаловать в Эльдорадо, первый компьютеризированный магазин электронной "
                    + "техники!");
            String poisk = "";
            while (!"SystemGoToAutoSleepAndOff".equals(poisk)) {
                System.out.println("\nДля ввода текста используйте клавиатуру, для отправки запроса - клавишу Enter."
                        + "\nДоступные команды:\n'1' - просмотр всех товаров\n'2' - побуквенный поиск\n");
                poisk = scan.nextLine();
                if ("Sobaka@Kot^.^".equals(poisk)) {
                    int v = -1;
                    System.out.println("Вы вошли в режим администратора. Вы можете управлять каталогом товаров."
                            + "\nЕсли вы "
                            + "не имеете право находиться в этом режиме, немедленно покиньте его.");
                    while (v != 0) {
                        System.out.println("\nВыберите нужную команду\n0. Выход из режима Администратора.\n1. "
                                + "Удаление товара из каталога\n2. Добавление товара в каталог.\n3. "
                                + "Просмотр каталога.");
                        v = scan.nextInt();
                        if (v == 1) {
                            eldorado.autput();
                            System.out.println("Какой элемент каталога вы хотите удалить?");
                            v = scan.nextInt();
                            if (v < eldorado.katalog.size() && v > 0) {
                                eldorado.katalog.remove(v);
                            }
                        } else if (v == 2) {
                            System.out.println("Введите название товара:");
                            String newpurch = "";
                            newpurch = scan.nextLine();
                            newpurch = scan.nextLine();
                            System.out.println("Введите цену  рублях:");
                            newpurch += " ";
                            newpurch += scan.nextLine();
                            eldorado.katalog.add(newpurch);
                        } else if (v == 3) {
                            eldorado.autput();
                        }
                    }
                } else if ("2".equals(poisk)) {
                    System.out.println("Ваш запрос:");
                    poisk = scan.nextLine();
                    System.out.println("Вот что мы нашли:");
                    for (int i = 1; i < eldorado.katalog.size(); i++) {
                        if (eldorado.katalog.get(i).indexOf(poisk) != -1) {
                            System.out.println(eldorado.katalog.get(i) + 'р');
                        }
                    }
                } else if (poisk.equals("1")) {
                    eldorado.autput();
                }
            }
            System.out.println("Электронный магазин закрыт!");
        } catch (InputMismatchException e) {
            System.out.println("Error");
            scan.nextInt();
        } finally {
            scan.close();
        }
    }
}
