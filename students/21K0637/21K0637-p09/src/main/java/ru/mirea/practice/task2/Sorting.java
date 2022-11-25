package ru.mirea.practice.task2;

public abstract class Sorting {
    public static void main(String[] args) {
        Student[] students = new Student[] {
            new Student(56, 21456),
            new Student(67, 21375),
            new Student(32, 21934),
            new Student(43, 21654),
            new Student(12, 21325)
        };

        qsort(students, 0, students.length - 1);

        for (Student student : students) {
            System.out.println(student);
        }
    }

    static void qsort(Student[] students, int start, int end) {
        if (start < end) {
            int partitionIdx = partition(students, start, end);

            qsort(students, start, partitionIdx - 1);
            qsort(students, partitionIdx + 1, end);
        }
    }

    private static int partition(Student[] students, int start, int end) {
        Student pivot = students[end];
        int i = start - 1;

        for (int j = start; j < end; j++) {
            if (students[j].compareTo(pivot) < 0) {
                i++;

                Student tmp = students[i];
                students[i] = students[j];
                students[j] = tmp;
            }
        }

        Student tmp = students[i + 1];
        students[i + 1] = students[end];
        students[end] = tmp;

        return i + 1;
    }
}
