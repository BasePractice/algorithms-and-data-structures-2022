package ru.mirea.practice.task1;

import java.util.Date;

public class Task {
    public Date getDate;
    public Date passDate;
    public String name;

    public Task(Date getDate, Date passDate, String name) {
        this.getDate = getDate;
        this.passDate = passDate;
        this.name = name;
    }

    public void setPassDate(Date passDate) {
        this.passDate = passDate;
    }

    @Override
    public String toString() {
        return "Task{" +
                "getDate=" + getDate +
                ", passDate=" + passDate +
                ", name='" + name + '\'' +
                '}';
    }
}
