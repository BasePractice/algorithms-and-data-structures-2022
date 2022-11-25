package ru.mirea.workfourteen.task8;

import java.util.Arrays;

public abstract class Fill {

    public static Object[] filter(Object[] arr, Filter filter) {
        int a = 0;

        for (int i = 0; i < arr.length; i++) {
            if (!filter.apply(arr[i])) {
                a++;
            } else {
                arr[i - a] = arr[i];
            }
        }
        return Arrays.copyOf(arr, arr.length - a);
    }

    public static void main(String[] args) {
        String[] a = new String[]{"a", "b", "c", "d", "e"};
        for (String s : a) {
            System.out.print(s + " ");
        }
        System.out.println("\n");

        String[] b = (String[]) filter(a, o -> o != "a");
        for (String s : b) {
            System.out.print(s + " ");
        }
    }
}

