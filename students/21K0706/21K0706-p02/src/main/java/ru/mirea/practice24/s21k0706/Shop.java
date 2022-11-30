package ru.mirea.practice24.s21k0706;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Shop {
    List<Computer> comp = new ArrayList<>();

    public void addComputer(Computer c) {
        comp.add(c);
    }

    public void searchComputer(String br, String md, String mr, String pr) {
        String st = "This computer has not been found";
        for (Computer a : comp) {
            if ((a.getBrand().equals(br)) & (a.getMemory().equals(mr)) & (a.getModel().equals(md)) & (a.getProcessor().equals(pr))) {
                st = "This computer has been found";
            }
        }
        System.out.println(st);
    }

    public void deleteComputer(String br, String md, String mr, String pr) {
        Iterator<Computer> compIterator = comp.iterator();
        while (compIterator.hasNext()) {
            Computer nextComp = compIterator.next();
            if ((nextComp.getBrand().equals(br)) & (nextComp.getMemory().equals(mr))
                    & (nextComp.getModel().equals(md)) & (nextComp.getProcessor().equals(pr))) {
                compIterator.remove();
            }
        }
    }

}

