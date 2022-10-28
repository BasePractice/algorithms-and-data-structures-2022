package ru.mirea.practice.task10;

import java.util.ArrayList;
import java.util.List;

public class Shop implements Interactionable {
    private List<Computer> catalog = new ArrayList<>();

    @Override
    public void getComputer(int idx) {
        System.out.println(catalog.get(idx));
    }

    @Override
    public void deleteComputer(int idx) {
        catalog.remove(idx);
    }

    @Override
    public void addComputer(Computer computer) {
        catalog.add(computer);
    }

    @Override
    public void findComputer(Computer computer) {
        if (catalog.isEmpty()) {
            System.out.println("Каталог пуст");
        } else {
            int count = 0;
            for (Computer comp : catalog) {
                if (comp.equals(computer)) {
                    count += 1;
                    System.out.println(" в наличии");
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
