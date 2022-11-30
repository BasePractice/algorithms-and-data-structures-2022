package ru.mirea.practice;

public class Student {
    private String lastName;
    private String specially;
    private int course;
    private String group;
    private int mark;

    public Student(String lastName, String specially, int course, String group) {
        this.lastName = lastName;
        this.specially = specially;
        this.course = course;
        this.group = group;
    }

    public int getMark() {
        return mark;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSpecially() {
        return specially;
    }

    public void setSpecially(String specially) {
        this.specially = specially;
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

    public void setMark(int mark) {
        this.mark = mark;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{ "
            + "lastName='" + lastName + '\''
            + ", specially='" + specially + '\''
            + ", course=" + course
            + ", group='" + group + '\''
            + ", mark='" + mark + '\''
            + '}';
    }
}
