package ru.mirea.workthirteen.task4;

public class Shirt {
    private String number;
    private String name;
    private String color;
    private String size;

    Shirt(String stroke) {
        String[] split = stroke.split(",");
        this.number = split[0];
        this.name = split[1];
        this.color = split[2];
        this.size = split[3];
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumber() {
        return number;
    }

    public String getSize() {
        return size;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "TShirt{" + "number='" + number + '\'' + ", name='" + name + '\'' + ", color='" + color + '\'' + ", size='" + size + '\'' + '}';
    }
}
