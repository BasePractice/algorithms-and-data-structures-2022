package ru.mirea.workthirteen.task2;

public class Person {
    private String name;
    private String surname;
    private String patronymic;
    private int age;


    Person(String name, String surname, String patronymic, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.patronymic = patronymic;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", surname='" + surname + '\'' + ", patronymic='" + patronymic + '\'' + ", age=" + age + '}';
    }

    public void print() {
        System.out.println(this.surname + " " + this.name.charAt(0) + "." + this.patronymic.charAt(0) + ".");
    }
}
