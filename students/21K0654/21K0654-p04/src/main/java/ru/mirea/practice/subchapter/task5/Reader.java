package ru.mirea.practice.subchapter.task5;

public class Reader {
    private String name;
    private int numB;
    private String fac;
    private int Pnum;
    private String birthdate;
    Reader(){}
    Reader(int numB,int Pnum,String name, String fac,String birthdate){
        this.birthdate=birthdate;this.fac=fac;this.name=name;this.numB=numB;this.Pnum=Pnum;
    }
    public void takeBook(int books){System.out.println(name+" took "+books+" books.");}
    public void takeBook(String[] arr) {
        System.out.println(name+" took:");
        for (String s:arr) {
            System.out.print("-"+s);
        }
    }
    public void takeBook(Book[] arr) {
        System.out.println(name+"took:");
        for (Book s:arr) {
            System.out.println("-"+s.getName());
        }
    }
    public void returnBook(int books){System.out.println(name+" returned "+books+" books.");}
}
