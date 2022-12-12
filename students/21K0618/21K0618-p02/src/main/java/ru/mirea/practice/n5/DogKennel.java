package ru.mirea.practice.n5;

public class DogKennel {

    public Dog[] dogs;

    public DogKennel(Dog[] dogs) {
        this.dogs = dogs;
    }

    public DogKennel() {
        dogs = new Dog[0];
    }

    public Dog[] getDogs() {
        return dogs;
    }

    public void setDogs(Dog[] dogs) {
        this.dogs = dogs;
    }

    public void addDog(Dog newDog) {
        Dog[] newdogs = new Dog[dogs.length + 1];
        for (int i = 0; i < dogs.length; i++) {
            newdogs[i] = dogs[i];
        }
        newdogs[dogs.length] = newDog;
        dogs = newdogs;
    }

}

