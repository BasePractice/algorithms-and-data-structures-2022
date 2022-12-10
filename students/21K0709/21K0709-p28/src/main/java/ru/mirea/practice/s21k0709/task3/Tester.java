package ru.mirea.practice.s21k0709.task3;

import java.util.Map;
import java.util.HashMap;

public abstract class Tester {
    public static void main(String[] args) {
        Map<Float, Integer> floatIntegerHashMap = new HashMap<>();
        floatIntegerHashMap.put(15f, 15);
        floatIntegerHashMap.put(20f, 20);
        floatIntegerHashMap.put(2f, 2);
        floatIntegerHashMap.put(123f, 123);
        floatIntegerHashMap.put(84f, 84);
        floatIntegerHashMap.put(33f, 33);
        System.out.println(floatIntegerHashMap);

    }
}
