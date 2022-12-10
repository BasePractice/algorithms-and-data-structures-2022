package ru.mirea.practice.s21k0627.task2;

public class Student {
    private String name;
    private String lastName;
    private String spec;
    private int course;
    private String group;
    private int score;

    public Student(String name, String lastName, String spec, int course, String group, int score) {
        this.name = name;
        this.lastName = lastName;
        this.spec = spec;
        this.course = course;
        this.group = group;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\''
                + ", lastName='" + lastName + '\''
                + ", spec='" + spec + '\''
                + ", course=" + course
                + ", group='" + group + '\''
                + ", score=" + score + '}';
    }
}
