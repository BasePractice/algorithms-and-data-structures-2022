package ru.mirea.practice.s21k0627.task1;

public class Customer {
    private String name;
    private int inn;

    public Customer(String name, int inn) throws InnException {
        this.name = name;
        this.inn = inn;
        if (inn < 0 || inn > 100) {
            throw new InnException("Wrong INN!");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getInn() {
        return inn;
    }

    public void setInn(int inn) {
        this.inn = inn;
    }

    @Override
    public String toString() {
        return "Customer{" + "name: " + name
                + ", inn: " + inn + '}';
    }
}
