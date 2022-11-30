package ru.mirea.workfourone.task7;

public class Student extends Pupil {
    public String name;
    public int age;

    public int course;


    Student(String name, int age, int course) {
        this.age = age;
        this.name = name;
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", age=" + age + ", course=" + course + '}';
    }
}
