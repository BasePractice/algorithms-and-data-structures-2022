package ru.mirea.practice.solutiontask2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;

public class Maps<K, V> {
    private Map<String, String> map;

    public Map<String, String> createMap() {
        map = new HashMap<>();
        map.put("Малахова", "Ира");
        map.put("Кадошникова", "Света");
        map.put("Астапенко", "Ксения");
        map.put("Малахова", "Света");
        map.put("Дюндин", "Саша");
        map.put("Дягтярева", "Саша");
        map.put("Иванов", "Ира");
        map.put("Дюндин", "Настя");
        map.put("Сурин", "Дапхонк");
        map.put("Жесткий", "Мамбет");
        return map;
    }

    public int getSameFirstLastNameCount(Boolean lastname) {
        List<String> lastfirst;
        if (lastname) {
            lastfirst = new ArrayList<>(map.keySet());
        } else {
            lastfirst = new ArrayList<>(map.values());
        }
        int totalname = 0;
        int tempname;
        for (int i = 0; i < map.size(); i++) {
            tempname = Collections.frequency(lastfirst, lastfirst.get(i));
            if (tempname > 1) {
                totalname += tempname;
            }
        }
        return totalname;
    }
}