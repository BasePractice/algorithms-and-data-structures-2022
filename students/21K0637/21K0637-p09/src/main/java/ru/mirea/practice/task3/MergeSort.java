package ru.mirea.practice.task3;

import ru.mirea.practice.task2.Student;

public abstract class MergeSort {
    public static void main(String[] args) {
        Student[] students1 = new Student[] {
            new Student(56, 21456),
            new Student(67, 21375),
            new Student(32, 21934),
            new Student(43, 21654),
            new Student(12, 21325)
        };
        Student[] students2 = new Student[] {
            new Student(34, 21731),
            new Student(98, 21862),
            new Student(21, 21531),
            new Student(61, 21982),
            new Student(70, 21752)
        };

        Student[] students = mergeSorting(merge(students1,students2));

        for (Student student : students) {
            System.out.println(student);
        }
    }

    static Student[] mergeSorting(Student[] students) {
        Student[] left;
        Student[] right;

        if (students.length < 2) {
            return students;
        } else {
            int midEl = students.length / 2;
            left = new Student[midEl];
            right = new Student[students.length - midEl];
            System.arraycopy(students, 0, left, 0, midEl);
            System.arraycopy(students, midEl, right, 0, students.length - midEl);

            left = mergeSorting(left);
            right = mergeSorting(right);
        }
        return merge(left, right);
    }

    public static Student[] merge(Student[] left, Student[] right) {
        Student[] result = new Student[left.length + right.length];

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.length && j < right.length) {
            if (left[i].compareTo(right[j]) <= 0) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }
        while (i < left.length) {
            result[k++] = left[i++];
        }
        while (j < right.length) {
            result[k++] = right[j++];
        }
        return result;
    }
}
