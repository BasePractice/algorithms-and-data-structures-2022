package ru.mirea.workfour.task4;

class Memory extends Computer {
    private int storage;

    public Memory(int price, String performance, int valuable) {
        this.performance = performance;
        this.valuable = valuable;
        this.price = price;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }
}
