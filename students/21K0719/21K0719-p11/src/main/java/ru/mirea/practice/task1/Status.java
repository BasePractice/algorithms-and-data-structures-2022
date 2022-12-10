package ru.mirea.practice.task1;

import java.util.Date;

public class Status {
    private String name;
    private Date start;
    private Date end;

    Status(String name, Date start) {
        this.name = name;
        this.start = start;
    }

    public String getName() {
        return name;
    }

    public Date getEnd() {
        return end;
    }

    public Date getStart() {
        return start;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    @Override
    public String toString() {
        return "name='" + name + '\''
                +
                ",start date :" + start
                +
                ", end date :" + end;
    }
}
