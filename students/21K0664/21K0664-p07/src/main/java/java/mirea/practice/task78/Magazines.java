package java.mirea.practice.task78;

public class Magazines implements Printable {
    private String name;

    Magazines() {
    }

    public Magazines(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Magazines{" + "name='" + name + '\'' + '}';
    }

    public void print() {
        System.out.println(this.name);
    }

    public static void printMagazines(Printable[] printables) {
        for (Printable p : printables) {
            if (p instanceof Magazines) {
                p.print();
            }
        }
    }
}

