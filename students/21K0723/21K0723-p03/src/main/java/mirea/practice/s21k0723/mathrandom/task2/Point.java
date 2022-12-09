package mirea.practice.s21k0723.mathrandom.task2;

public class Point {
    private float x = 0;
    private float y = 0;

    public Point() {
        //
    }

    public Point(float  x, float  y) {
        this.x = x;
        this.y = y;
    }

    public void setX(float  x) {
        this.x = x;
    }

    public float  getX() {
        return x;
    }

    public void setY(float  y) {
        this.y = y;
    }

    public float  getY() {
        return y;
    }



    @Override
    public String toString() {
        return  "x = "
                + x + " y = "
                + y;
    }
}