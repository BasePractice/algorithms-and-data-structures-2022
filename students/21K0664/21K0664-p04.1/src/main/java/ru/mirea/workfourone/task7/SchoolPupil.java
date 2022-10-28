package ru.mirea.workfourone.task7;

public class SchoolPupil extends Pupil {
    public String name;
    public int age;

    SchoolPupil(String name, int age) {
        this.age = age;
        this.name = name;
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
        return "SchoolPupil{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}
