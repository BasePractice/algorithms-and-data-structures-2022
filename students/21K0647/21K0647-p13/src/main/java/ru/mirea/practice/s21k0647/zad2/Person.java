package ru.mirea.practice.s21k0647.zad2;

public class Person {
    String name;
    String lastname;
    String patronymic;

    Person() {
        name = "-";
        lastname = "-";
        patronymic = "-";
    }

    Person(String lastname) {
        this.lastname = lastname;
    }

    Person(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    Person(String name, String lastname, String patronymic) {
        this.name = name;
        this.lastname = lastname;
        this.patronymic = patronymic;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    @Override
    public String toString() {
        return "Имя "  + name + "\tФамилия " + lastname + "\tОтчество " + patronymic;
    }

    public static void main(String[] args) {
        Person []persons = new Person[2];
        persons[0] = new Person();
        persons[1] = new Person();
        persons[0].setName("Ivan");
        persons[0].setLastname("Ivanov");
        persons[0].setPatronymic("Ivanovich");
        persons[1].setName("Peter");
        persons[1].setLastname("Petrov");
        for (Person x: persons) {
            System.out.println(x);
        }

    }


}
