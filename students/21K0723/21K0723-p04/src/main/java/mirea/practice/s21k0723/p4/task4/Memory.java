package mirea.practice.s21k0723.p4.task4;

public class Memory {
    int memoryreadrecord;
    int memoryread;
    int speed;

    Memory(int memoryread, int memoryreadrecord, int speed) {
        this.memoryread = memoryread;
        this.speed = speed;
        this.memoryreadrecord = memoryreadrecord;
    }

    @Override
    public String toString() {
        return "Memory read only: "
                + this.memoryread
                + " \n"
                + "Memory read-record: "
                + this.memoryreadrecord + " \n"
                + "Speed: "
                + this.speed;
    }
}
