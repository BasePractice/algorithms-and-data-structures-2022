package ru.mirea.workfour.task4;

public class Computer {
    protected int price;
    protected String performance;
    protected int valuable;

    Computer(int price, String performance, int valuable) {
        this.performance = performance;
        this.valuable = valuable;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getValuable() {
        return valuable;
    }

    public String getPerformance() {
        return performance;
    }


    public void setPerformance(String performance) {
        this.performance = performance;
    }


    public void setValuable(int valuable) {
        this.valuable = valuable;
    }

    @Override
    public String toString() {
        return "price=" + price + ", performance='" + performance + ", valuable=" + valuable;
    }

    public enum DetailsCompute {
        Apple, Asus, Huawei;
    }
}
