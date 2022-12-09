package ru.mirea.practice.task3;


public abstract class Main {
    public static void main(String[] args) {
        Adress address1 = new Adress("test, test, test ,1343 , 234, 234324");
        Adress address2 = new Adress("test1, test1, test1, 3245, 47, 3445");
        Adress address3 = new Adress("test2, test3, test2, 32, 4, 45");
        Adress address4 = new Adress("test3, test2, test3, 3232345, 43247, 3442345");
        System.out.println(address1.getAddress());
        System.out.println(address2.getAddress());
        System.out.println(address3.getAddress());
        System.out.println(address4.getAddress());
    }
}
