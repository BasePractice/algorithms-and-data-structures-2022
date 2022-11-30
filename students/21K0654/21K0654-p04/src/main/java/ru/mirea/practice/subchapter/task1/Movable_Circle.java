package ru.mirea.practice.subchapter.task1;

public class Movable_Circle extends Movable_point implements Movable{
    private int r;
    private Movable_point c;
    public Movable_Circle(int r,int x,int y,int xSpeed,int ySpeed){
        super(x, y, xSpeed, ySpeed);
        this.c=new Movable_point(  x, y, xSpeed, ySpeed);
        this.r=r;
    }

    @Override
    public void moveUp() {
        c.moveUp();
    }

    @Override
    public void moveDown() {
        c.moveDown();
    }

    @Override
    public void moveLeft() {
        c.moveLeft();
    }

    @Override
    public void moveRight() {
        c.moveRight();
    }
    @Override
    public String toString(){
        return c.toString()+" Radius:"+this.r;
    }
}
