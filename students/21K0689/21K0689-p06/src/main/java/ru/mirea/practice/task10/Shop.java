package ru.mirea.practice.task10;

import java.util.ArrayList;
import java.util.List;

public class Shop implements Interface {
    private List<Computer> assortment = new ArrayList<>();

    @Override
    public void getComputer(int index) {
        System.out.println(assortment.get(index));
    }

    @Override
    public void deleteComputer(int index) {
        assortment.remove(index);

    }

    @Override
    public void findComputer(Computer computer) {
        if (assortment.isEmpty()) {
            System.out.println("Каталог пуст");
        } else {
            int count = 0;
            for (Computer comp : assortment) {
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
    public void addComputer(Computer computer) {
        assortment.add(computer);

    }

    @Override
    public String toString() {
        return assortment.toString();
    }
}
