package ru.mirea.practice.s.task4;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Computer> catalog = new ArrayList<>();

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
            for (Computer comp : catalog) {
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
