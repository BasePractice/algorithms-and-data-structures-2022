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

        Dog Gu4ka = new Dog("Жучка", 5);
        Dog Bobik = new Dog("Бобик", 9);
        Dog Krepish = new Dog("Крепыш", 15);

        System.out.println(Gu4ka);
        System.out.println(Krepish + ". В человеческих годах это - " + Krepish.getHumanAge() + " лет!");
        System.out.println("2021 год. " + Bobik);
        Bobik.setAge(4);
        System.out.println("2022 год. " + Bobik);

        DogKennel Zavod4ica = new DogKennel();
        Dog[] Doggies = {Gu4ka, Bobik, Krepish};
        Zavod4ica.setDogs(Doggies);
        Zavod4ica.addDog(new Dog("Руперт", 1));

        System.out.println("А недавно у нас появился новый пёс!" + Zavod4ica.Dogs[Zavod4ica.Dogs.length-1] + "- он совсем ещё щенок.");
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
