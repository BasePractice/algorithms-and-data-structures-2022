public class Circle extends Shape {
    private double r;
    Circle(){}

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public void setColor(String color) {
        this.color=color;
    }

    @Override
    public boolean isFilled() {
        return this.filled;
    }

    @Override
    public void setFilled(boolean filled) {
        this.filled=filled;
    }
    Circle(double r){
        this.r=r;
    }
    Circle(double r, String color, boolean filled){
        this.r=r;
        this.color=color;
        this.filled=filled;
    }
    public double getRadius(){
        return this.r;
    }
    public void setRadius(double r){
        this.r=r;
    }
    @Override
    public double getArea(){
        return 3.14*r*r;
    }
    @Override
    public double getPerimeter(){
        return 2*3.14*r;
    }
    @Override
    public String toString() {
        return "Circle:{Radius = "+r+", Area = "+(3.14*r*r)+", Perimeter = "+(2*3.14*r)+"}";
    }
}
