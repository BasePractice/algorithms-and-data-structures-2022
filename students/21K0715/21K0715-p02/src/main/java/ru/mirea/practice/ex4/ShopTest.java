package ru.mirea.practice.ex4;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

final class ShopTest {
    private ShopTest() {

    }

    public static void main(final String[] args) throws IOException {
        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream(("5 ENIAC SETUN ALGAGA URURU"
                + " DONTLOOKATME").getBytes());
        System.setIn(in);
        System.setIn(sysInBackup);
        sysInBackup.close();
        System.out.println("String: ");
        Shop s = new Shop();
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