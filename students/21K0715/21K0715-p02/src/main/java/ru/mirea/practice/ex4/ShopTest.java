package ru.mirea.practice.ex4;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

class ShopTest {
    public static void main(String[] args) {
        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream(("5 ENIAC SETUN ALGAGA URURU" +
                " DONTLOOKATME").getBytes());
        System.setIn(in);
        Shop s = new Shop();
        System.setIn(sysInBackup);
        System.out.println("String: ");
        System.out.println(s);

        Computer comp = new Computer("AHAHA");
        s.add(comp);
        System.out.println("After add(comp):");
        System.out.println(s);


        s.remove(3);
        System.out.println("After remove(3):");
        System.out.println(s);

        System.out.println("s.find(\"ENIAC\"): " + s.find("ENIAC"));
        System.out.println("s.find(\"CROCOZABRA\"): " + s.find("CROCOZABRA"));
    }
}