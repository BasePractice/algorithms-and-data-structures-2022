package ru.mirea.practice.s21k0647.zad12;

import java.util.Hashtable;
import java.util.Map;

public class Diction {
    private Map<String, String> dic = new Hashtable<>();

    public void hashtabHash() {
        // pust
    }


    Diction() {
        // pust
    }

    public Map hashtabInit() {
        dic = new Hashtable<>();
        return dic;
    }

    public void hashtabAdd(String key, String val) {
        dic.put(key, val);
    }

    public Object hashtabLookup(String key) {
        Object rez;
        if (dic.containsKey(key)) {
            rez = "Объект с ключом '" + key + "' - '" + dic.get(key) + "'";
        } else {
            rez = "Объект не найден";
        }
        return rez;
    }

    public Map hashtabDelete(String key) {
        System.out.println("Удаление объекта '" + dic.get(key) + "'");
        dic.remove(key);
        System.out.println();
        print();
        return dic;
    }

    public void print() {
        System.out.println("Словарь: ");
        for (String it: dic.keySet()) {
            System.out.println(it + ": " + dic.get(it));
        }

    }
}
