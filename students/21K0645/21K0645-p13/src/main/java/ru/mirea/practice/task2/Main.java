package ru.mirea.practice.task2;

/* Разработать класс Person, в котором имеется функция,
возвращающая Фамилию И.О. Функция должна учитывать возможность
отсутствия значений в полях Имя и Отчество. Программу оптимизировать с
точки зрения быстродействия */

public final class Main {

    private Main() {
    }

    public static void main(String[] args) {
        Person person = new Person("Kulebyakin", "Pavel", "Sergeevich");
        System.out.println(person.getFio());
    }
}
