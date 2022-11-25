package ru.mirea.practice.solutiontask4;

import java.util.Objects;

public class Shop {
    private final Computer[] computers;

    public Shop(int count) {
        this.computers = new Computer[count];
        for (int i = 0; i < count; i++) {
            this.computers[i] = new Computer("", "", "", "", "");
        }
    }

    public void addComputer(Computer pc) {
        for (int i = 0; i < this.computers.length; i++) {
            if (Objects.equals(this.computers[i].getNamePc(), "")
                    || Objects.equals(this.computers[i].getCpu(), "")
                    || Objects.equals(this.computers[i].getMemory(), "")
                    || Objects.equals(this.computers[i].getMotherboard(), "")
                    || Objects.equals(this.computers[i].getVideoCard(), "")) {
                this.computers[i] = pc;
                return;
            }
        }
    }

    public void removeComputer(Computer pc) {
        for (int i = 0; i < this.computers.length; i++) {
            if (this.computers[i] == pc) {
                this.computers[i] = new Computer("", "", "", "", "");
                return;
            }
        }
    }

    public String findComputer(int numcomputer) {
        if (numcomputer - 1 >= this.computers.length) {
            return "Такого компьютера нет";
        }
        return this.computers[numcomputer - 1].toString();
    }

    @Override
    public String toString() {
        StringBuilder toreturn = new StringBuilder();
        for (Computer computer : this.computers) {
            toreturn.append(computer).append("\n");
        }
        return toreturn.toString();
    }
}
