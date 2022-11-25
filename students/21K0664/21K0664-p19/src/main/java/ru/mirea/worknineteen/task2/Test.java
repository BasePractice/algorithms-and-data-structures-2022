package ru.mirea.worknineteen.task2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Test {
    public static void main(String[] args) {
        Student a = new Student("Ivan", "Ivanov", 201);
        Student b = new Student("Max", "Maxiomv", 199);
        Student c = new Student("Jack", "Jackson", 121);

        ArrayList<Student> students = new ArrayList<>();
        students.add(a);
        students.add(b);
        students.add(c);

        SortBygpa sorts = new SortBygpa();
        students.sort(sorts);

        for (Student student : students) {
            System.out.println(student);
        }

        Scanner in = new Scanner(System.in);
        try {
            String searchName = in.next();
            String searchSurname = in.next();
            a.contain(students, searchName, searchSurname);
        } catch (InputMismatchException e) {
            System.out.println("Error");
            in.next();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            in.close();
        }
    }

}
