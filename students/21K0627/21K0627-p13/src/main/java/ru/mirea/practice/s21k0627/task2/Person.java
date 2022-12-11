package ru.mirea.practice.s21k0627.task2;

public class Person {
    private final String lastname;
    private String name = "";
    private String middlename = "";

    public Person(String lastname) {
        this.lastname = lastname;
    }

    public Person(String lastname, String name) {
        this.lastname = lastname;
        this.name = name;
    }

    public Person(String lastname, String name, String middlename) {
        this.lastname = lastname;
        this.name = name;
        this.middlename = middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    @Override
    public String toString() {
        return "Person{"
                + "lastname='" + lastname
                + ", name='" + name
                + ", middlename='" + middlename + '}';
    }

    public String getFIO() {
        if (name.length() == 0) {
            return new StringBuilder().append(lastname).append(", имя и отчество отсутствуют").toString();
        }

        if (middlename.length() == 0) {
            return new StringBuilder().append(lastname).append(" ").append(name.charAt(0)).append(", отчество отсутствует").toString();
        }

        return new StringBuilder().append(lastname).append(" ").append(name.charAt(0)).append(".").append(middlename.charAt(0)).append(".").toString();
    }
}
