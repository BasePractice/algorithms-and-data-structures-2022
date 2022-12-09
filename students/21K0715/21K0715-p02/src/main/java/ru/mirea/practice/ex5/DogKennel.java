package ru.mirea.practice.ex5;

import java.util.Arrays;

public class DogKennel {
    Dog[] dogs;

    public DogKennel() {
        dogs = new Dog[0];
    }

    public DogKennel(Dog[] dogs) {
        this.dogs = dogs;
    }

    public void add(Dog dog) {
        Dog[] newDogs = new Dog[dogs.length+1];
        System.arraycopy(dogs, 0, newDogs, 0, dogs.length);
        newDogs[dogs.length] = dog;
        dogs = newDogs;
    }

    public void add(Dog[] dogs) {
        Dog[] newDogs = new Dog[this.dogs.length + dogs.length];
        System.arraycopy(this.dogs, 0, newDogs, 0, this.dogs.length);
        System.arraycopy(dogs,0,newDogs,this.dogs.length,dogs.length);
        this.dogs = newDogs;
    }

    @Override
    public String toString() {
        return "DogKennel{" +
                "dogs=" + Arrays.toString(dogs) +
                '}';
    }
}
