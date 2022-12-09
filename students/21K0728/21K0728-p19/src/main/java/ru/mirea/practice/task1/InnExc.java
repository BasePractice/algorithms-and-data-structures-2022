package ru.mirea.practice.task1;

public class InnExc extends Exception {
    public InnExc(String mes, InnExc exc) {
        super(mes, exc);
    }

    public InnExc(String mes) {
        super(mes);
    }
}
