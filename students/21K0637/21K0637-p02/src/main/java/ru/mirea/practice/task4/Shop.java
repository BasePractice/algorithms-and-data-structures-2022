package ru.mirea.practice.task4;

import java.util.ArrayList;

public class Shop {
    private ArrayList<Computer> catalog = new ArrayList<>();

    public void addComputer(Computer computer) {
        catalog.add(computer);
    }

    public void deleteComputer(Computer computer) {
        catalog.remove(computer);
    }

    public void searchComputer(Computer computer) {
        if (catalog.isEmpty()) {
            System.out.println("Каталог пуст");
        } else {
            int count = 0;
            for (int i = 0; i < catalog.size(); i++) {
                Computer comp = catalog.get(i);
                if (comp.equals(computer)) {
                    count += 1;
                    System.out.println(computer.getBrand() + " " + computer.getModel() + " в наличии");
                }
            }
            if (count == 0) {
                System.out.println("Товар отсутствует");
            }
        }
    }

    @Override
    public String toString() {
        return catalog.toString();
    }
}
