package ru.mirea.practice.Work_2;

public class Phone {
    private String number;
    private String model;
    private double weight;
    Phone(){}
    Phone(String number, String model, double weight){
        this.number=number;
        this.model=model;
        this.weight=weight;
        Phone a=new Phone(number, model);
    }
    Phone(String number, String model){
        this.number=number;
        this.model=model;
    }
    public String receiveCall(String name){
        return "Звонит "+name;
    }
    public String receiveCall(String name, String number){
        return "Звонит "+name+" с номера телефона: "+number;
    }
    public String getNumber(){
        return number;
    }
    public String[] sendMessage(String...number){
        return number;
    }
    public String toString() {
        return "Phone:{Number: "+number+", Model: "+model+", Weight: "+weight+"}";
    }

    public static void main(String[] args) {
        Phone a=new Phone("89034562341", "IPhone 2", 34.5);
        Phone b=new Phone("89389427563", "IPhone 32", 435.4);
        Phone c=new Phone("89928752374", "IPhone 1", 164.9);
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
        System.out.println(a.receiveCall("Григорий"));
        System.out.println(b.receiveCall("Мария", "89343245678"));
        System.out.println(c.receiveCall("Зенаида"));
        System.out.println(a.getNumber());
        System.out.println(b.getNumber());
        System.out.println(c.getNumber());
        String[]d={"891238768732", "891238768732"};
        int i=0;
        while(i<d.length) {
            System.out.println(a.sendMessage(d)[i]);
            i++;
        }
    }
}
