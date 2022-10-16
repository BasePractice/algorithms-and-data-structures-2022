package ru.mirea.practice.Math_and_Random.Work_2;

public class Tester {
    private final int a;
    private final Circle[] arr;
    Tester(int a){
        this.a=a;
        this.arr=new Circle[a];
    }
    public void setCircle(Circle k,int z){
        this.arr[z]=k;
    }
    public Circle getBig() {
        for (int i = 0; i < this.a - 1;) {
            for (int j = 1; j < this.a; j++) {
                if (this.arr[i].getR() < this.arr[j].getR()) {
                    i = j;
                }
            }
            return this.arr[i];
        }
        return this.arr[0];
    }
    public Circle getSmall() {
        for (int i = 0; i < this.a - 1;) {
            for (int j = 1; j < this.a; j++) {
                if (this.arr[i].getR() > this.arr[j].getR()) {
                    i = j;
                }
            }
            return this.arr[i];
        }
        return this.arr[0];
    }

    public void Sort() {
        for (int i = 0; i < this.a - 1;i++) {
            for (int j = 1; j < this.a; j++) {
                if(this.arr[i].getR() > this.arr[j].getR()){
                    Circle buff=this.arr[j];
                    this.arr[j]=this.arr[i];
                    this.arr[i]=buff;
                }
            }
        }
    }

    public String toString()
    {
        System.out.println("\n");
        for (int i = 0; i < this.a;i++) {
            System.out.println("{"+this.arr[i].toString() + "}");
        }
        return " ";
    }

    public static void main(String[] args) {
        Point P=new Point(35,24);
        Circle a = new Circle(P,Math.random());
        Circle b = new Circle(P,Math.random());
        Circle c = new Circle(P,Math.random());

        Tester Ar=new Tester(3);
        Ar.setCircle(a,0);
        Ar.setCircle(b,1);
        Ar.setCircle(c,2);

        System.out.println(Ar.getBig());
        System.out.println(Ar.getSmall());

        Ar.Sort();

        System.out.println(Ar.toString());
    }
}
