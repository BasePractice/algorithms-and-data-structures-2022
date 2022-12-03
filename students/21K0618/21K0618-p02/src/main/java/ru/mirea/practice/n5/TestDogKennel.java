package ru.mirea.practice.n5;

public class TestDogKennel {
    public static void main(String[] args) {

        Dog gu4Ka = new Dog("Жучка", 5);
        Dog bobik = new Dog("Бобик", 9);
        Dog krepish = new Dog("Крепыш", 15);

        System.out.println(gu4Ka);
        System.out.println(krepish + ". В человеческих годах это - " + krepish.getHumanAge() + " лет!");
        System.out.println("2021 год. " + bobik);
        bobik.setAge(4);
        System.out.println("2022 год. " + bobik);

        DogKennel zavod4Ica = new DogKennel();
        Dog[] doggies = {gu4Ka, bobik, krepish};
        zavod4Ica.setDogs(doggies);
        zavod4Ica.addDog(new Dog("Руперт", 1));

        System.out.println("А недавно у нас появился новый пёс!" + zavod4Ica.dogs[zavod4Ica.dogs.length - 1] + "- он совсем ещё щенок.");
    }
}
