package mirea.practice.s21k0723.p401.task2;

import java.util.ArrayList;
import java.util.List;

public abstract class Tester {
    public static void main(String[] args) {
        Phone a1 = new Phone(1, 9, 130);
        Phone a2 = new Phone(2, 13, 210);
        Phone a3 = new Phone(3, 11, 340);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        Phone a4 = new Phone(4,10);
        System.out.println(a4.receiveCall("Vova","79314377293"));
        List<String> list = new ArrayList<String>();
        list.add("7924284025");
        list.add("7929163325");
        a4.sendMessage(list);
    }
}
