package ru.mirea.worktwo.task4;

public class Shop {
    Computer[] arrComputer;
    Computer comp;
    int n;
    int cur = 0;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
        arrComputer = new Computer[n];
    }

    public void setComputer(int vcardClass, double frequency, int ram, int hdd) {
        this.comp = new Computer(vcardClass, frequency, ram, hdd);
    }

    public void addComputer(int vcardClass, double frequency, int ram, int hdd) {
        this.comp = new Computer(vcardClass, frequency, ram, hdd);
        if (cur < n) {
            arrComputer[cur] = comp;
            cur += 1;
        } else {
            System.out.println("Вы добавили максимальное количество компьютеров.");
        }
    }

    public void deleteComputer(int vcardClass, double frequency, int ram, int hdd) {
        this.comp = new Computer(vcardClass, frequency, ram, hdd);
        int f = 0;
        for (int i = 0; i < cur; i++) {
            if (comp.equals(arrComputer[i])) {
                for (int g = 0; g < n - 1; g++) {
                    if (arrComputer[g].equals(arrComputer[i])) {
                        Computer temp;
                        temp = arrComputer[g + 1];
                        arrComputer[g + 1] = arrComputer[g];
                        arrComputer[g] = temp;
                    }
                }
                cur -= 1;
                System.out.println("Компьютер №" + (i + 1) + "удален");
                break;
            }
            f = i;
        }
        if (f == n - 1) {
            System.out.println("Компьютер не найден");
        }
    }

    public void search(int vcardClass, double frequency, int ram, int hdd) {
        this.comp = new Computer(vcardClass, frequency, ram, hdd);
        int f = 0;
        for (int i = 0; i < n; i++) {
            if (comp.equals(arrComputer[i])) {
                System.out.println("Искомый компьютер №" + (i + 1));
                break;
            }
            f = i;
        }
        if (f == n - 1) {
            System.out.println("Компьютер не найден");
        }
    }

    public void allComputers() {
        for (int i = 0; i < n; i++) {
            System.out.println("№" + (i + 1) + ":" + arrComputer[i]);
        }
    }
}
