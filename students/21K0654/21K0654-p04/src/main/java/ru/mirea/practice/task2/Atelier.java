package ru.mirea.practice.task2;

import java.util.Scanner;

public class Atelier implements WomenClothing, MenClothing {

    @Override
    public void dressMan(Clothes[] arr) {
        for (Clothes clothes : arr) {
            clothes.dressMan(arr);
        }
    }

    @Override
    public void dressWoman(Clothes[] arr) {
        for (Clothes clothes : arr) {
            clothes.dressWoman(arr);
        }
    }

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Количество одежды:");
        Clothes[] arr = new Clothes[sc.nextInt()];
        System.out.println("Выберите тип одежды(1-футболка, 2-штаны, 3- юбка, 4-галстук) а затем ее размер(XXS,XS,S,M,L):");

        for (int i = 0; i < arr.length; i++) {
            System.out.println((i + 1) + "-й товар");
            switch (sc.nextInt()) {
                case 1: {
                    sc = new Scanner(System.in);
                    arr[i] = new TShirt(Size.valueOf(sc.nextLine()), 20, "black");
                    break;
                }
                case 2: {
                    sc = new Scanner(System.in);
                    arr[i] = new Pants(Size.valueOf(sc.nextLine()), 40, "white");
                    break;
                }
                case 3: {
                    sc = new Scanner(System.in);
                    arr[i] = new Skirt(Size.valueOf(sc.nextLine()), 25, "red");
                    break;
                }
                case 4: {
                    sc = new Scanner(System.in);
                    arr[i] = new Tie(Size.valueOf(sc.nextLine()), 15, "yellow");
                    break;
                }
                default:
                    break;
            }
            System.out.println('\n' + "...");
        }
        for (Clothes clothes : arr) {
            System.out.println(clothes.toString());
        }
        Atelier a = new Atelier();
        a.dressMan(arr);
        a.dressWoman(arr);
    }

}
