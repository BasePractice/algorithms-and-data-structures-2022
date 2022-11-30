package ru.mirea.practice.task5;

public abstract class Tester {
    public static void main(String[] args) {
        DogKennel dogKennel = new DogKennel();
        Dog sharik = new Dog("sharik", 18);
        Dog bublik = new Dog("bublik", 50);

        System.out.println("Человеческий возраст шарика " + sharik.ageToHuman() + " месяцев");
        System.out.println("Возраст Бублика " + bublik.getAge() + " месяцев");
        //Возраст в месяцах
        dogKennel.addDog(sharik);
        dogKennel.addDog(bublik);

        System.out.println(dogKennel);
    }

}
