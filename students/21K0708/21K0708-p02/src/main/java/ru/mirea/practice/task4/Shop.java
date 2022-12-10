package ru.mirea.practice.task4;

import java.util.List;

class Shop {
    private List<Computer> computerArrayList;
    private static int numberOfComputers = 0;

    public void addComputer(String manufacturer, String model, double price) {
        computerArrayList.add(new Computer(price, manufacturer, model));
        numberOfComputers++;
    }

    public void deleteComputer(String manufacturer, String model) {
        for (int i = 0; i < numberOfComputers; i++) {
            if (computerArrayList.get(i).getManufacturer().equals(manufacturer) && computerArrayList.get(i).getModel().equals(model)) {
                computerArrayList.remove(i);
            }
        }
        numberOfComputers--;
    }

    public void deleteComputer(int index) {
        computerArrayList.remove(index);
    }

    public boolean searchComputer(String manufacturer, String model) {
        for (int i = 0; i < numberOfComputers; i++) {
            if (computerArrayList.get(i).getManufacturer().equals(manufacturer) && computerArrayList.get(i).getModel().equals(model)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return computerArrayList.toString();
    }
}
