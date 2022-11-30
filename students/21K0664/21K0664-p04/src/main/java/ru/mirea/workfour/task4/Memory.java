package ru.mirea.workfour.task4;

class Memory extends Computer {
    private int storage;

    public Memory(int price, String performance, int valuable) {
        super(price, performance, valuable);
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }
}
