package mirea.practice.s21k0723.task1;

public class MovablePoint implements Movable {
    protected int x;
    protected int y;
    protected int xs;
    protected int ys;

    public MovablePoint(int x, int y, int xs, int ys) {
        this.x = x;
        this.y = y;
        this.xs = xs;
        this.ys = ys;
    }

    public MovablePoint() {
        //
    }


    @Override
    public void moveUp() {
        this.y += ys;
    }

    @Override
    public void moveDown() {
        this.y -= ys;
    }

    @Override
    public void moveLeft() {
        this.x -= xs;
    }

    @Override
    public void moveRight() {
        this.x += xs;
    }

    @Override
    public String toString() {
        return "MovablePoint{"
                +
                "x="
                + x
                +
                ", y="
                + y
                +
                ", xSpeed="
                + xs
                +
                ", ySpeed="
                + ys
                +
                '}';
    }
}
