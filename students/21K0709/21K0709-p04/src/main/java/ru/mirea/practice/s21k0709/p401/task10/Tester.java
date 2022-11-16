package ru.mirea.practice.s21k0709.p401.task10;

public abstract class Tester {
    public static void main(String[] args) {
        Vehicle [] mas = new Vehicle[4];
        Vehicle airplane = new Airplane(10,100,1000, 10,1000);
        Vehicle car = new Car(3,5,20,100, 100);
        Vehicle ship = new Ship(10,25, 50, 1500, 80);
        mas[0] = airplane;
        mas[1] = car;
        mas[2] = ship;
        Vehicle train = new Train(15,100,150,20,100);
        mas[3] = train;
        for (Vehicle i: mas) {
            System.out.println(i + " время поездки: " + i.time(1000));
            System.out.println(i + " стоимость поездки: " + i.cost(1000));
        }
    }
}
