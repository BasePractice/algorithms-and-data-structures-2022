package ru.mirea.workten.task2;


public class Tester {
    private final int a;
    private final Student[] arr;

    Tester(int a) {
        this.a = a;
        this.arr = new Student[a];
    }

    public void setArray(Student k, int z) {
        this.arr[z] = k;
    }

    public String outArray() {
        for (int i = 0; i < this.a; i++) {
            System.out.println("{" + this.arr[i].toString() + "}");
        }
        return " ";
    }


}


