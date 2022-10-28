package Practice2;

import java.util.Scanner;
import java.util.ArrayList;

class Shop {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        Shop Eldorado = new Shop();
        //Комбинация для входа в режим Администратора Sobaka@Kot^.^
        //Для выключения системы введите SystemGoToAutoSleepAndOff
        System.out.println("Добро пожаловать в Эльдорадо, первый компьютеризированный магазин электронной техники!");
        String poisk = "";
        while (!poisk.equals("SystemGoToAutoSleepAndOff")) {
            System.out.println("\nДля ввода текста используйте клавиатуру, для отправки запроса - клавишу Enter.\nДоступные команды:\n'1' - просмотр всех товаров\n'2' - побуквенный поиск\n");
            poisk = scan.nextLine();
            if (poisk.equals("Sobaka@Kot^.^")) {
                int V = -1;
                System.out.println("Вы вошли в режим администратора. Вы можете управлять каталогом товаров.\nЕсли вы не имеете право находиться в этом режиме, немедленно покиньте его.");
                while (V != 0) {
                    System.out.println("\nВыберите нужную команду\n0. Выход из режима Администратора.\n1. Удаление товара из каталога\n2. Добавление товара в каталог.\n3. Просмотр каталога.");
                    V = scan.nextInt();
                    if (V == 1) {
                        Eldorado.Autput();
                        System.out.println("Какой элемент каталога вы хотите удалить?");
                        V = scan.nextInt();
                        if (V < Eldorado.Katalog.size() && V > 0) {
                            Eldorado.Katalog.remove(V);
                        }
                    } else if (V == 2) {
                        System.out.println("Введите название товара:");
                        String NewPurch = "";
                        NewPurch = scan.nextLine();
                        NewPurch = scan.nextLine();
                        System.out.println("Введите цену  рублях:");
                        NewPurch += " ";
                        NewPurch += scan.nextLine();
                        Eldorado.Katalog.add(NewPurch);
                    } else if (V == 3) {
                        Eldorado.Autput();
                    }
                }
            }
            else if (poisk.equals("2")) {
                System.out.println("Ваш запрос:");
                poisk = scan.nextLine();
                System.out.println("Вот что мы нашли:");
                for (int i = 1; i < Eldorado.Katalog.size(); i++) {
                    if (Eldorado.Katalog.get(i).indexOf(poisk) != -1) {
                        System.out.println(Eldorado.Katalog.get(i) + 'р');
                    }
                }
            } else if (poisk.equals("1")) {
                Eldorado.Autput();
            }
        }
        System.out.println("Электронный магазин закрыт!");
    }


    public ArrayList<String> Katalog;

    public Shop(ArrayList<String> katalog) {
        Katalog = katalog;
        Katalog.add(0, "Список товаров:\n");
    }

    public Shop() {
        Katalog = new ArrayList<String>();
        Katalog.add(0, "Список товаров:\n");
    }

    public ArrayList<String> getKatalog() {
        return Katalog;
    }

    public void setKatalog(ArrayList<String> katalog) {
        Katalog = katalog;
    }

    public void Autput() {
        System.out.println(Katalog.get(0));
        for (int i = 1; i < Katalog.size(); i++) {
            System.out.println(i + ". " + Katalog.get(i) + "р\n");
        }
    }
}
