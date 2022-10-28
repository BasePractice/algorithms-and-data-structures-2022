package ru.mirea.practice.solutiontask4;


import java.util.Scanner;

public final class TestShop {
    private TestShop() {}

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите кол-во компьютеров:");
            int temp = sc.nextInt() + 3;
            Shop megashop = new Shop(temp);
            Computer first = new Computer("PRO100 KRUTOI", "Ryzen 5 3600", "gtx 1060",
                    "asus rog strix b450-f gaming", "Crucial x2 4gb");
            megashop.addComputer(first);
            System.out.println(first.getCpu());
            Computer second = new Computer("MEGA COMP", "intel i9 12900k", "gtx 3070",
                    "ASROCK Z690 Taichi", "hyper x x4 4gb");
            megashop.addComputer(second);
            Computer third = new Computer("TOPOVII COMPUTER", "ryzen 7 5800x", "gtx 3080ti",
                    "ASUS AM4 TUF Gaming X570-Plus", "A Data x8 8gb");
            megashop.addComputer(third);

            System.out.println(megashop.findComputer(1));

            for (int i = 0; i < temp - 3; i++) {
                System.out.println("Вводите последовательно названия компьютера, процессора, видеокарты, "
                        + "мат. платы и оперативной памяти:");
                String name = sc.next();
                String cpu = sc.next();
                String videocard = sc.next();
                String motherboard = sc.next();
                String memory = sc.next();
                megashop.addComputer(new Computer(name, cpu, videocard, motherboard, memory));
            }

            System.out.println(megashop);
        }
    }
}
