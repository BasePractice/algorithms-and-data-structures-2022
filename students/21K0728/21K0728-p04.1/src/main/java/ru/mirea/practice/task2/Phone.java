package ru.mirea.practice.task2;

public class Phone {
    private String numb;
    private String mod;
    private int weighte;

    public String getNumb() {
        return numb;
    }

    public void setNumb(String numb) {
        this.numb = numb;
    }

    public String getMod() {
        return mod;
    }

    public void setMod(String mod) {
        this.mod = mod;
    }

    public int getWeighte() {
        return weighte;
    }

    public void setWeighte(int weighte) {
        this.weighte = weighte;
    }

    public String receiveCall(String caller) {
        return "Call from " + caller;
    }

    public String receiveCall(String caller, String number) {
        return "Call from " + caller + " Phone number is: " + number;
    }

    public void sendMessage(String... numbers) {
        for (String s : numbers) {
            System.out.print(s + " ");
        }
    }

    public Phone(String numb, String mod, int weighte) {
        this(numb, mod);
        this.weighte = weighte;
    }

    public Phone(String numb, String mod) {
        this.numb = numb;
        this.mod = mod;
        weighte = 0;
    }

    public Phone() {
        numb = " ";
        mod = " ";
        weighte = 0;
    }
}
