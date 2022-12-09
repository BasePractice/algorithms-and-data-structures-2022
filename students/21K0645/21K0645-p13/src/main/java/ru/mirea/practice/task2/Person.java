package ru.mirea.practice.task2;

public class Person {
    private String name;
    private final String surname;
    private String patronymic;


    public Person(String name, String surname, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getFio() {
        if (name.isBlank()) {
            name = "None";
        }

        if (patronymic.isBlank()) {
            patronymic = "None";
        }

        return surname + " " + name.charAt(0) + ". " + patronymic.charAt(0) + ". ";
    }
}
