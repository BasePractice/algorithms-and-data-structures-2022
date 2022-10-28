package ru.mirea.practice.task1;

public abstract class Sorting {
    public static void main(String[] args) {
        Student[] iDNumber = {new Student(21789),
            new Student(22345),
            new Student(21746)};

        for (int left = 0; left < iDNumber.length; left++) {
            Student value = iDNumber[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value.compareTo(iDNumber[i]) < 0) {
                    iDNumber[i + 1] = iDNumber[i];
                } else {
                    break;
                }
            }
            iDNumber[i + 1] = value;
        }

        for (Student student : iDNumber) {
            System.out.println(student);
        }
    }
}
