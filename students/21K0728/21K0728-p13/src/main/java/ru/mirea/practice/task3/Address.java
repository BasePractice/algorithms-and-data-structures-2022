package ru.mirea.practice.task3;

import java.util.StringTokenizer;

public class Address {
    private String cntr;
    private String reg;
    private String town;
    private String street;
    private String building;
    private String entrance;
    private String flat;

    public void setSplit(String string) {
        String[] temp = string.split(", ");
        cntr = temp[0];
        reg = temp[1];
        town = temp[2];
        street = temp[3];
        building = temp[4];
        entrance = temp[5];
        flat = temp[6];
    }

    public void setToken(String string) {
        String[] temp = new String[7];
        StringTokenizer token = new StringTokenizer(string,",.;");
        int i = 0;
        while (token.hasMoreTokens()) {
            temp[i] = token.nextToken();
            i++;
        }
        cntr = temp[0];
        reg = temp[1];
        town = temp[2];
        street = temp[3];
        building = temp[4];
        entrance = temp[5];
        flat = temp[6];
    }

    @Override
    public String toString() {
        return cntr + "\n" + reg + "\n" + town + "\n" + street
                + "\n" + building + "\n" + entrance + "\n" + flat;
    }
}
