package ru.mirea.practice.task7and8;

public class Magazine implements Printable {
    private String name;

    public Magazine(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Magazine's name is: " + name);
    }

    public static void printMagazines(Printable[] prints) {
        for (Printable print : prints) {
            if (print instanceof Magazine) {
                print.print();
            }
        }
    }
}
