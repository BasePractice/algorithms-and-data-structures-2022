package ru.mirea.practice.task1;

import java.util.Date;

public class Programmer {
    private String nm;
    private Date strt;
    private Date nd;

    public Programmer(String nm, Date strt) {
        this.nm = nm;
        this.strt = strt;
    }

    public String getName() {
        return nm;
    }

    public void setName(String nm) {
        this.nm = nm;
    }

    public Date getStart() {
        return strt;
    }

    public void setStart(Date strt) {
        this.strt = strt;
    }

    public Date getEnd() {
        return nd;
    }

    public void setEnd(Date nd) {
        this.nd = nd;
    }

    @Override
    public String toString() {
        return "Programmer{"
                + "Name is: " + nm  + ", the date of starting is: " + strt + ", the date of ending is: " + nd + '}';
    }
}
