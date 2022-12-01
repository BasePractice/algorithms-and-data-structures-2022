package Practice2;

class DogKennel {

    public Dog[] Dogs;

    public DogKennel(Dog[] dogs) {
        Dogs = dogs;
    }

    public DogKennel() {}

    public Dog[] getDogs() {
        return Dogs;
    }

    public void setDogs(Dog[] dogs) {
        Dogs = dogs;
    }

    public void addDog(Dog newDog) {
        Dog[] NewDogs = new Dog[Dogs.length + 1];
        for (int i = 0; i < Dogs.length; i++)
            NewDogs[i] = Dogs[i];
        NewDogs[Dogs.length] = newDog;
        Dogs = NewDogs;
    }

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
        Dog[] Doggies = {gu4Ka, bobik, krepish};
        zavod4Ica.setDogs(Doggies);
        zavod4Ica.addDog(new Dog("Руперт", 1));

        System.out.println("А недавно у нас появился новый пёс!" + zavod4Ica.Dogs[zavod4Ica.Dogs.length-1] + "- он совсем ещё щенок.");
    }
}

class Dog {

    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog() { }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHumanAge()
    {
        return (this.age*7);
    }

    @Override
    public String toString() {
        return " Собака " +
                "по кличке " + name +
                " прожила " + age +
                " полных лет";
    }
}
