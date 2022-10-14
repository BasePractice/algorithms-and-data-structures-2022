package java.mirea.practice.task78;

public class Books implements Printable {
    private String name;

    Books() {}

    public Books(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Books{" + "name='" + name + '\'' + '}';
    }

    public void print() {
        System.out.println(this.name);
    }

    public static void printBooks(Printable[] printables) {
        for (Printable p : printables) {
            if (p instanceof Books) {
                p.print();
            }
        }
    }
}

