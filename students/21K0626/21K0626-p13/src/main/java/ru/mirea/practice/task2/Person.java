package ru.mirea.practice.task2;

public class Person {
    private final String surname;
    private String name;
    private String thirdname;


    public Person(String surname, String name, String thirdname) {
        this.surname = surname;
        this.name = name;
        this.thirdname = thirdname;
    }


    @Override
    public String toString() {
        return "Person{"
                +
                "surname='" + surname + '\''
                +
                ", name='" + name + '\''
                +
                ", thirdname='" + thirdname + '\''
                +
                '}';
    }

    public String fio() {
        if (name.length() == 0) {
            name = "Имя не заполнено";
        }

        if (thirdname.length() == 0) {
            thirdname = "Отчество не заполнено";
        }

        return new StringBuilder().append(surname).append(" ").append(name.charAt(0))
                .append(".").append(thirdname.charAt(0)).append(".").toString();


    }
    public static void main(String[] args) {
        Person person = new Person("Kvasov", "Gleb", "Sergeevich");
        System.out.println(person.fio());
    }
}
