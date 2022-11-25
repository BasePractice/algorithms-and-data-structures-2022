package ru.mirea.worktwo.task5;

public class DogShelter {
    Dog[] arrDog;
    int cur = 0;
    private int n;

    public DogShelter(int n) {
        this.n = n;
        arrDog = new Dog[n];
    }

    public void allDogs() {
        for (int i = 0; i < n; i++) {
            System.out.println(arrDog[i]);
        }
    }

    public void addDogs(Dog a) {
        if (cur < n) {
            arrDog[cur] = a;
            cur += 1;
        }
    }

    public void addDogs(Dog a, Dog b) {
        if (cur < n) {
            arrDog[cur] = a;
            cur += 1;
        }
        if (cur < n) {
            arrDog[cur] = b;
            cur += 1;
        }
    }

    public void addDogs(Dog a, Dog b, Dog c) {
        if (cur < n) {
            arrDog[cur] = a;
            cur += 1;
        }
        if (cur < n) {
            arrDog[cur] = b;
            cur += 1;
        }
        if (cur < n) {
            arrDog[cur] = c;
            cur += 1;
        }
    }

    public void addDogs(Dog a, Dog b, Dog c, Dog d) {
        if (cur < n) {
            arrDog[cur] = a;
            cur += 1;
        }
        if (cur < n) {
            arrDog[cur] = b;
            cur += 1;
        }
        if (cur < n) {
            arrDog[cur] = c;
            cur += 1;
        }
        if (cur < n) {
            arrDog[cur] = d;
            cur += 1;
        }
    }

    public void addDogs(Dog a, Dog b, Dog c, Dog d, Dog e) {
        if (cur < n) {
            arrDog[cur] = a;
            cur += 1;
        }
        if (cur < n) {
            arrDog[cur] = b;
            cur += 1;
        }
        if (cur < n) {
            arrDog[cur] = c;
            cur += 1;
        }
        if (cur < n) {
            arrDog[cur] = d;
            cur += 1;
        }
        if (cur < n) {
            arrDog[cur] = e;
            cur += 1;
        }
    }
}
