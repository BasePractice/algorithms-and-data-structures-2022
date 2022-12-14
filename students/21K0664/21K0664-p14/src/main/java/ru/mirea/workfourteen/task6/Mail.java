package ru.mirea.workfourteen.task6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

abstract class Mail {
    public static void main(String[] args) {
        Pattern a = Pattern.compile(", ");
        String[] b = a.split("user@example.com, myhost@@@com.ru");

        Pattern p1 = Pattern.compile("(\\w+)@(\\w+).(com)");
        Pattern p2 = Pattern.compile("(\\w+)@(\\w+).(ru)");

        for (String word : b) {
            Matcher matcher1 = p1.matcher(word);
            Matcher matcher2 = p2.matcher(word);
            if (!matcher1.matches() & !matcher2.matches()) {
                System.out.println("Error");
            } else {
                System.out.println(word);
            }
        }
    }
}
