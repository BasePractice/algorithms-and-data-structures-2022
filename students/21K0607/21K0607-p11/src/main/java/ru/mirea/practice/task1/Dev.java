package ru.mirea.practice.task1;

import java.util.Date;

public class Dev {
    private final String fio;
    private Date startDate;
    private Date endDate;

    public Dev(String fio, Date startDate) {
        this.fio = fio;
        this.startDate = startDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Dev{" + "fio='" + fio + '\'' + ", Дата выдачи задания =" + startDate + ", Дата сдачи задания =" + endDate + '}';
    }
}

