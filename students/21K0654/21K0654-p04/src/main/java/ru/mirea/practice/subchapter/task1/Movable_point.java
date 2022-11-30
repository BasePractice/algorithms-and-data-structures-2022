package ru.mirea.practice.subchapter.task1;

public class Movable_point implements Movable{

    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;
    Movable_point(int x,int y,int xSpeed,int ySpeed){this.x=x;this.y=y;this.xSpeed=xSpeed;this.ySpeed=ySpeed;}

    @Override
    public void moveUp() {
        this.y+=1;
    }

    @Override
    public void moveDown() {
        this.y-=1;
    }

    @Override
    public void moveLeft() {
        this.x-=1;
    }

    @Override
    public void moveRight() {
        this.x+=1;
    }
    @Override
    public  String toString(){
        return "X:"+this.x+" Y:"+this.y+" xSpeed:"+this.xSpeed+" ySpeed:"+this.ySpeed;
    }
}
