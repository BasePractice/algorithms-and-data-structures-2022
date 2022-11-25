package ru.mirea.practice.task13;

public class StringListener implements OnStringChangeListener {

    @Override
    public void onChange(UserStringBuilder stringBuilder) {
        System.out.println("Changed: " + stringBuilder.toString());
    }
}
