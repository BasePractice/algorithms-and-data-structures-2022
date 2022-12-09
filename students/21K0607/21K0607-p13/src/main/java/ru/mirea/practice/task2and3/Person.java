package ru.mirea.practice.task2and3;

import ru.mirea.practice.task3.Adress;

public class Person {
    private String name;
    private final String lastName;
    private String patr;

    private Adress address;

    public Person(String name, String surname, String patronymic, Adress address) {
        this.name = name;
        this.lastName = surname;
        this.patr = patronymic;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPatr() {
        return patr;
    }

    public String getAddress() {
        return address.getAddress();
    }

    public String getFio() {
        if (name == null) {
            name = "N";
        }
        if (patr == null) {
            patr = "N";
        }

        return new StringBuilder().append(lastName).append(" ")
                .append(name.charAt(0)).append(". ").append(patr.charAt(0)).append(". ").toString();
    }
}
