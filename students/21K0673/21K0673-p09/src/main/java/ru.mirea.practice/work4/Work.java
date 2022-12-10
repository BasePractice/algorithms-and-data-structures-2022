package ru.mirea.practice.work4;

public class Work implements Comparable {
    int number;

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    Work(int number) {
        this.number = number;
    }

    @Override
    public void compareTo(Work[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].getNumber() > array[i].getNumber()) {
                    int buff = array[i].getNumber();
                    array[i].setNumber(array[j].getNumber());
                    array[j].setNumber(buff);
                }
            }
        }
    }
}
