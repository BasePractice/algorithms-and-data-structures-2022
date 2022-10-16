package Practice_4.Work_3;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;
public enum Shop {
    Mihail("LOGIN"), _1234("PASSWORD");
    private final String a;
    Shop(String a){
        this.a=a;
    }

    public String getA() {
        return a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("SHOP\nВведите логин:");
        String login = in.next();
        Shop shop=Shop.valueOf(login);
        while (!Objects.equals(login, "Mihail")) {
            System.out.println("\nВведите логин:");
            login = in.next();
            shop=Shop.valueOf(login);
        }

        System.out.println("\nВведите пароль:");
        String password = in.next();
        shop=Shop.valueOf(password);
        while (!Objects.equals(password, "_1234")) {
            System.out.println("\nВведите пароль:");
            password = in.next();
            shop=Shop.valueOf(password);
        }

        double price = 0;
        Locale locFR = new Locale("en");
        Locale.setDefault(Locale.UK);

        System.out.println("\nChoose a catalog:\n1.Food\n2.Staff");
        String catalog_buff = in.next();
        if(Objects.equals(catalog_buff, "FOOD") | Objects.equals(catalog_buff, "STAFF")){
            Catalog catalog=Catalog.valueOf(catalog_buff);
        }else{
            while (!Objects.equals(catalog_buff, Catalog.FOOD.toString()) | !Objects.equals(catalog_buff, Catalog.STAFF.toString())) {
                System.out.println("\nChoose a catalog: ");
                catalog_buff = in.next();
                Catalog catalog=Catalog.valueOf(catalog_buff);
            }
        }

        switch (catalog_buff) {
            case ("FOOD"):{
                System.out.println("Choose a good:\n1.Honey\n2.Banana");
                String food_buff = in.next();
                if(Objects.equals(food_buff, "HONEY") | Objects.equals(food_buff, "BANANA")){
                    Food food=Food.valueOf(food_buff);
                }else {
                    while (!Objects.equals(food_buff, Food.HONEY.toString()) | !Objects.equals(food_buff, Food.BANANA.toString())) {
                        System.out.println("\nChoose a good: ");
                        food_buff = in.next();
                        Food food = Food.valueOf(food_buff);
                    }
                }

                switch (food_buff) {
                    case ("HONEY") -> price = 123.45;
                    case ("BANANA") -> price = 12.79;
                }
            }
            case ("STAFF"):{
                System.out.println("\nChoose a good:\n1.Umbrella");
                String staff_buff = in.next();
                if(Objects.equals(catalog_buff, "UMBRELLA")){
                    Staff staff=Staff.valueOf(staff_buff);
                }else {
                    while (!Objects.equals(staff_buff, Staff.UMBRELLA.toString())) {
                        System.out.println("Choose a good: ");
                        staff_buff = in.next();
                        Staff staff = Staff.valueOf(staff_buff);
                    }
                }
                price = 571.09;
            }
        }

        System.out.println("\nChoose a currency for payment:\n1.$\n2.€\n3.¥\n4.£");
        int c = in.nextInt();
        while (c < 1 | c > 4) {
            System.out.println("\nChoose a currency:");
            c = in.nextInt();
        }

        switch (c) {
            case 1 -> {
                NumberFormat numberFormat1 = NumberFormat.getCurrencyInstance(Locale.US);
                price /= 1.12;
                System.out.println(numberFormat1.format(price));
            }
            case 2 -> {
                NumberFormat numberFormat2 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
                price /= 1.16;
                System.out.println(numberFormat2.format(price));
            }
            case 3 -> {
                NumberFormat numberFormat3 = NumberFormat.getCurrencyInstance(Locale.CHINA);
                price /= 7.48;
                System.out.println(numberFormat3.format(price));
            }
            case 4 -> {
                NumberFormat numberFormat4 = NumberFormat.getCurrencyInstance();
                System.out.println(numberFormat4.format(price));
            }
        }
    }
}
