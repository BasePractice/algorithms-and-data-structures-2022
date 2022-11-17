package Practice2;

import java.util.Scanner;

class HowMany {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Невероятно полезная программа!\nВведите любой текст и получите ответ, о котором даже не догадываетесь!");
            String string = scan.nextLine().trim();
            int count = 0;
            if (!string.equals("")) {
                while (string.charAt(0) == ' ' || string.charAt(string.length() - 1) == ' ') {
                    string = string.trim();
                }
                if (!string.equals("")) {
                    int i = 0;
                    count += 1;
                    while (string.charAt(i) != ' ' && i + 1 < string.length()) i += 1;
                    while (i < string.length()) {
                        if (string.charAt(i) == ' ') {
                            count += 1;*
                            while (string.charAt(i) == ' ') {i += 1;}
                        }
                        i += 1;
                    }
                }
            }
            if (count == 0) {
                System.out.println("Вы ничего не ввели? Печально :(");
            } else {
                System.out.println("Ответ: Вы ввели с консоли " + count + " слов(o/а)! Правда полезное знание?");
            }
        }
    }
}
