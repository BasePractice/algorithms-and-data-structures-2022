package ru.mirea.practice.s21k0627.task1;

public abstract class Test {
    public static void main(String[] args) {
        Student[] iDNumber = {new Student(23), new Student(17), new Student(92), new Student(11), new Student(57)};
        for (int i = 0; i < iDNumber.length; i++) {
            Student s = iDNumber[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (s.compare(iDNumber[j]) == 1) {
                    iDNumber[j + 1] = iDNumber[j];
                } else {
                    break;
                }
            }
            iDNumber[j + 1] = s;
        }
        for (Student student : iDNumber) {
            System.out.println(student);
        }
    }
}
