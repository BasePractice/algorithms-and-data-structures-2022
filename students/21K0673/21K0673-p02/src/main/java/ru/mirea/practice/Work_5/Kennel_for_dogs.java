package ru.mirea.practice.Work_5;

public class Kennel_for_dogs {
    public static void main(String[] args) {
        Dog[] a = new Dog[10];
        Dog c=new Dog(3,"Шарик");
        System.out.println(c);
        c.getInHuAge();
        a[0]=c;
        Dog[] b = new Dog[11];
        for(int i = 0;i < 11; i++){
            System.out.println(b[i]);
        }
        System.arraycopy(a, 0, b, 0, 10);
        System.out.println(c.getAge());
        System.out.println(c.getInHuAge());
        System.out.println(c.getName());
        c.setAge(5);
        c.setName("sdg");
        c.setAgeName(324,"324");
    }
}
