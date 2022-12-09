package mirea.practice.s21k0723.p401.task2;

import java.util.List;

public class Phone {
    int num;
    int type;
    double height;

    Phone(int num, int type, double height) {
        this.num = num;
        this.type = type;
        this.height = height;
    }

    Phone(int num, int type) {
        this.num = num;
        this.type = type;
    }

    Phone() {
        //
    }

    public String receiveCall(String nameCall) {
        return "Звонит " + nameCall;
    }

    public String receiveCall(String nameCall, String numberCall) {
        return "Имя звонящего: " + nameCall + "\n" + "Номер телефона: " + numberCall;
    }

    public int getNum() {
        return num;
    }

    public void sendMessage(List<String> str) {
        for (String i: str) {
            System.out.println(i);
        }
    }

    @Override
    public String toString() {
        return "Number: "
                + num
                + "\n"
                + "Model: "
                + type + "\n"
                +
                "Height: "
                + height;
    }
}
