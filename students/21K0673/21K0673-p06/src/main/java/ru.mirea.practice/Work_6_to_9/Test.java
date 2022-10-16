package Practice_6.Work_6_to_9;

public class Test {
    public static void main(String[] args) {
        Printable []printable= {
                new Book(),
                new Book()
        };
        int i=0;
        while (i<2){
            printable[i].print();
            i++;
        }
    }
}
