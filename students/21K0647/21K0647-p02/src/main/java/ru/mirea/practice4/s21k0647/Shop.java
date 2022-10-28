package ru.mirea.practice4.s21k0647;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    List<Computer> cC = new ArrayList<>();

    public void addComputer(Computer a) {
        cC.add(a);
    }


    public void deleteComputer(String model) {
        for (Computer x : cC) {
            if (x.model.equals(model)) {
                cC.remove(x);
            }
        }
    }

    public String searchComputer(String model) {
        String n = "Not found";
        for (Computer x : cC) {
            if (x.model.equals(model)) {
                n =  "Model: " + x.model + "\tProcessor: " + x.processor + "\tmemory: " + x.memory + "\tBattery: " + x.battery;
            }
        }
        return n;
    }
}


