package ru.mirea.practice.s21k0709.task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Tester {

    public static Map<String, String> createMap() {
        Map<String, String> peopleMap = new HashMap<>();
        peopleMap.put("Turchaninov", "Daniil");
        peopleMap.put("Ivanov", "Ivan");
        peopleMap.put("Cristiano", "Ronaldo");
        peopleMap.put("Baturin", "Maxim");
        peopleMap.put("Kvasov", "Ivan");
        peopleMap.put("Kirillov", "Kirill");
        peopleMap.put("Ivanov", "Sergei");
        peopleMap.put("Baturin", "Rodion");
        peopleMap.put("Michailov", "Kolya");
        peopleMap.put("Putin", "Vladimir");
        System.out.println(peopleMap);
        return peopleMap;
    }


    public static int getSameFirstNameCount(Map<String, String> humans) {
        List<String> stringList = new ArrayList<>();
        List<String> names = new ArrayList<>(humans.values());
        int nameCounts = 0;
        for (int i = 0; i < names.size(); i++) {
            for (int j = 0; j < names.size(); j++) {
                try {
                    if (!stringList.contains(names.get(i))) {
                        stringList.add(names.get(i));
                    }
                    if (names.get(i).equals(names.get(j)) && i != j) {
                        nameCounts++;
                    }

                    if (j + 1 == names.size()) {
                        names.remove(stringList.get(i));
                    }
                } catch (IndexOutOfBoundsException ex) {
                    break;
                }
            }
        }
        return nameCounts;
    }

    public static int getSameLastNameCount(Map<String, String> humans) {
        List<String> stringList = new ArrayList<>();
        List<String> surnames = new ArrayList<>(humans.values());
        int surnameCounts = 0;
        for (int i = 0; i < surnames.size(); i++) {
            for (int j = 0; j < surnames.size(); j++) {
                try {
                    if (!stringList.contains(surnames.get(i))) {
                        stringList.add(surnames.get(i));
                    }
                    if (surnames.get(i).equals(surnames.get(j)) && i != j) {
                        surnameCounts++;
                    }

                    if (j + 1 == surnames.size()) {
                        surnames.remove(stringList.get(i));
                    }
                } catch (IndexOutOfBoundsException ex) {
                    break;
                }
            }
        }
        return surnameCounts;
    }

    public static void main(String[] args) {
        Map<String, String> peopleMap = createMap();
        System.out.println(getSameFirstNameCount(peopleMap));
        System.out.println(getSameLastNameCount(peopleMap));
    }

}
