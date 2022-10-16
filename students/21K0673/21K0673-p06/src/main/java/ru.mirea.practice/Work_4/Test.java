package ru.mirea.practice.Work_4;

public class Test implements Priceable {
    private int price;
    Test(int price){
        this.price=price;
    }
    @Override
    public double getPrice() {
        return this.price;
    }

    public static void main(String[] args) {
        Test test=new Test(435987);
        System.out.println(test.getPrice());
    }
}
