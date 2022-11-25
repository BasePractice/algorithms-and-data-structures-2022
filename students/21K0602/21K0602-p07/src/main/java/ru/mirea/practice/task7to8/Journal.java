package ru.mirea.practice.task7to8;

public class Journal implements Printable {
    private String name;


    Journal(String name) {
        this.name = name;
    }


    String getName() {
        return name;
    }


    @Override
    public void print() {
        System.out.println("Журнал: " + name);
    }

    public static void printMagazines(Printable[] printables) {
        for (Printable printable : printables) {
            printable.print();
        }
    }
}
