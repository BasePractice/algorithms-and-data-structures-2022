package ru.mirea.workfour.task2;

public final class Main {
    private Main() {
    }

    public static void main(String[] args) {
        Clothes[] clothes = new Clothes[10];
        clothes[0] = new Pants(Size.XS, 1200, "red");
        clothes[1] = new Pants(Size.XXS, 990, "yellow");
        clothes[2] = new Skirt(Size.L, 2000, "white");
        clothes[3] = new Tie(Size.M, 900, "red");
        clothes[4] = new TShirt(Size.S, 1800, "black");
        clothes[5] = new TShirt(Size.XS, 1500, "blue");
        clothes[6] = new Skirt(Size.XS, 1200, "light blue");
        clothes[7] = new Tie(Size.S, 1700, "black");
        clothes[8] = new Pants(Size.L, 3000, "graphite");
        clothes[9] = new TShirt(Size.M, 2500, "white");
        Atelier atelier = new Atelier();
        atelier.dressMan(clothes);
        System.out.println();
        atelier.dressWomen(clothes);
    }
}
