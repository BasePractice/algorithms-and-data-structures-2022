package ru.mirea.practice.work4;

abstract class Main {
    public static void main(String[] args) {
        Work[] mains = new Work[5];
        mains[0] = new Work(8);
        mains[1] = new Work(4);
        mains[2] = new Work(1);
        mains[3] = new Work(3);
        mains[4] = new Work(3);

        Work main = new Work(0);
        main.compareTo(mains);

        for (int i = 0; i < 5; i++) {
            System.out.println(mains[i].getNumber());
        }
    }
}
