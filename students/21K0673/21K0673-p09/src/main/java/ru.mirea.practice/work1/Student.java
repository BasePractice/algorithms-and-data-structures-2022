package ru.mirea.practice.work1;

class Student {

    public int[] idNumber;

    public Student() {
        idNumber = new int[]{10, 234, 32, 12, 124, 23};
    }

    public void sort() {
        for (int left = 0; left < idNumber.length; left++) {
            int value = idNumber[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < idNumber[i]) {
                    idNumber[i + 1] = idNumber[i];
                } else {
                    break;
                }
            }
            idNumber[i + 1] = value;
        }
    }

    public void print() {
        for (int aidnumber : idNumber) {
            System.out.println(aidnumber);
        }
    }
}
