package ru.mirea.practice.task10;


import java.util.ArrayList;
import java.util.List;

public class Shop implements Inputable {

    private List<Computer> computers;

    public Shop() {
        computers = new ArrayList<>();
    }

    @Override
    public void getCatalog() {
        if (!computers.isEmpty()) {
            for (int i = 0; i < computers.size(); i++) {
                System.out.println(i + " " + computers.get(i).toString());
            }
        } else {
            System.out.println("Catalog is empty");
        }

    }

    @Override
    public void addComputer(Computer computer) {
        computers.add(new Computer(computer.getCompany()));
    }

    @Override
    public void deleteComputer(Computer computer) {
        if (!computers.isEmpty()) {
            computers.remove(computer);
        } else {
            System.out.println("Catalog is already empty");
        }

    }

    @Override
    public void getComputer(int index) {
        if (!computers.isEmpty()) {
            computers.get(index).toString();
        } else {
            System.out.println("Catalog empty");
        }


    }

    @Override
    public void findComputer(Computer computer) {
        if (computers.isEmpty()) {
            System.out.println("Магазин пуст");
        } else {
            boolean flag = false;
            for (Computer computer1 : computers) {
                if (computer.equals(computer1)) {
                    System.out.println("Компьютер найден");
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println("компьютер отсутствует");
            }
        }

    }
}