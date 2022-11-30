package ru.mirea.worknineteen.task1;

import java.util.regex.Pattern;

public class Student {

    private String fio;

    private String inn;

    Student(String fio, String inn) throws BadInn {
        this.fio = fio;
        Pattern p = Pattern.compile("[0-9]");
        if (inn.length() > 10 || p.matcher(inn).matches()) {
            throw new BadInn("Error");
        } else {
            this.inn = inn;
        }
    }

    public String getFio() {
        return fio;
    }

    public String getInn() {
        return inn;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    @Override
    public String toString() {
        return "Student{" + "fio='" + fio + '\'' + ", inn='" + inn + '\'' + '}';
    }
}
