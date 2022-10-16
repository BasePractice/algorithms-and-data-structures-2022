package Practice_6.Work_2;

public class MovableRectangle extends MovablePoint{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    MovableRectangle(int x, int y, int xSpeed, int ySpeed,MovablePoint topLeft,MovablePoint bottomRight) {
        super(x, y, xSpeed, ySpeed);
        this.bottomRight=bottomRight;
        this.topLeft=topLeft;
    }
    public String toString() {
        return "MovableRectangle: {topLeft"+topLeft.toString()+"bottomRight"+bottomRight.toString()+"}";
    }
    public void check(){
        this.topLeft.xSpeed=this.bottomRight.xSpeed;
        this.topLeft.ySpeed=this.bottomRight.ySpeed;
    }
}
