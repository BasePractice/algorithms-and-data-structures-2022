package ru.mirea.practice.s21k0647;

import java.util.Date;

public class Punkt1 {
    String lastname;
    Date pol;
    Date sdal;

    Punkt1(String lastname, Date pol, Date sdal) {
        this.lastname = lastname;
        this.pol = pol;
        this.sdal = sdal;
    }

    @Override
    public String toString() {
        return "Фамилия " + lastname + "\tПолучил " + pol + "\tСдал " + sdal;
    }

    public static void main(String[] args) {
        Punkt1 []razrabs = new Punkt1[3];
        razrabs[0] = new Punkt1("Ivanov", new Date(1522121212121L), new Date(1522121212121L));
        razrabs[1] = new Punkt1("Smirnov", new Date(1532121212121L), new Date(1552121212121L));
        razrabs[2] = new Punkt1("Petrov", new Date(1522121214121L), new Date(1522125212121L));

        for (Punkt1 x: razrabs) {
            System.out.println(x);
        }

    }
}
