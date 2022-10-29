package ru.mirea.practice.task4.s21k0709;

import java.util.ArrayList;
import java.util.Iterator;

public class Shop {
    private ArrayList<String> computers = new ArrayList<String>();

    public ArrayList<String> getComputers() {
        return computers;
    }

    public void setComputers(ArrayList<String> computers) {
        this.computers = computers;
    }

    public String searchComp(Shop c1, String namecomp) {

        for (String name : c1.getComputers()) {
            if (name.equals(namecomp)) {
                return name + " - найден в списке";
            }
        }
        return "Нет в наличии";
    }

    public void deleteComp(Shop c1, int index) {
        Iterator<String> iter = c1.getComputers().iterator();
        int j = 0;
        while (iter.hasNext()) {
            iter.next();
            if (j == index) {
                iter.remove();
            }
            j++;
        }
    }

    public void addComp(Shop c1, String namecomp) {
        c1.getComputers().add(namecomp);
    }
}
