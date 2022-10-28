package ru.mirea.workthirteen.task3;

abstract class Test {

    public static void main(String[] args) {
        Adress a = new Adress("Страна Регион Город Улица Дом Корпус Квартира");
        System.out.println(a + "\n");
        a.print("Страна,Регион.Город\nУлица,Дом,Корпус.Квартира");

    }
}
