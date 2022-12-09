package ru.mirea.practice.task1;

import java.util.Date;

public class Developer {
    private final String surname;
    private Date startDate;
    private Date endDate;

    public Developer(String surname, Date startDate) {
        this.surname = surname;
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
        return "Developer{" + "surname='" + surname + '\'' + ", Дата и время получения задания =" + startDate
                + ", Дата и время сдачи задания=" + endDate + '}';
    }
}

