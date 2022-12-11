package ru.mirea.practice.task1;

/* Написать программу, выводящую фамилию разработчика, дату и время
получения задания, а также дату и время сдачи задания. Для получения
последней даты и времени использовать класс Date из пакета java.util.*
(Объявление Dated=newDate() или метод System.currentTimeMillis() */

import java.util.Date;

public final class Test {

    private Test() {
    }

    public static void main(String[] args) throws InterruptedException {

        Developer developer = new Developer("Kulebyakin Pavel", new Date());

        Thread.sleep(2000);
        developer.setEndDate(new Date());

        System.out.println(developer);

    }
}
