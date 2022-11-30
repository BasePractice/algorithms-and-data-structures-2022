package ru.mirea.practice.task7;

public class Student extends Learner {
    private final String group;
    private final int course;

    public Student(String fio, int age, String group, int course) {
        super(fio, age);
        this.group = group;
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Student " + super.getFio() + " age " + super.getAge() + " group='" + group + '\'' + ", course="
                + course;
    }
}
