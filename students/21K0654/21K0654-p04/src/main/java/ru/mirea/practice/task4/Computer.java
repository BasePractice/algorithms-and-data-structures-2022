package ru.mirea.practice.task4;

public class Computer {
    private Memory memory;
    private Processor processor;
    private  VideoCard videoCard;
    private Computers mark;
    public Computer(String mem,String proc, String vc,Computers mark){
        this.memory=new Memory(mem);
        this.processor=new Processor(proc);
        this.videoCard=new VideoCard(vc);
        this.mark = mark;
    }
}
