package ru.mirea.practice.s21k0627.task1;

import java.util.Date;

public class Information {
    private Date gettingDate;
    private final String developer;
    private Date passDate;

    public Information(Date gettingDate, String developer) {
        this.gettingDate = gettingDate;
        this.developer = developer;
    }

    public Date getGettingDate() {
        return gettingDate;
    }

    public void setGettingDate(Date gettingDate) {
        this.gettingDate = gettingDate;
    }

    public Date getPassDate() {
        return passDate;
    }

    public void setPassDate(Date passDate) {
        this.passDate = passDate;
    }

    @Override
    public String toString() {
        return "Разработчик: " + developer
                + ", дата получения задания: " + gettingDate
                + ", дата сдачи задания: " + passDate;
    }
}
