package ru.mirea.practice.solutiontask1;

public class Trotter {
    private final int[] nums;
    private final boolean[] arrows;
    // при false стрелка направлена влево
    // изначально в arrows все значение false т.к у нас отсортированный массив
    private final int count;

    public Trotter(int n) {
        count = n;
        nums = new int[n];
        arrows = new boolean[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i + 1;
            System.out.print(nums[i]);
        }
        System.out.print("\n");
        for (int i = 0; i < n; i++) {
            arrows[i] = false;
        }
    }

    public int searchArr(int mobile) {
        for (int i = 0; i < count; i++) {
            if (nums[i] == mobile) {
                return i + 1;
            }
        }
        return 0;
    }

    public int getMaxMobile() {
        int mobileprev = 0;
        int mobile = 0;
        for (int i = 0; i < count; i++) {
            if (!arrows[nums[i] - 1] && i != 0) {
                if (nums[i] > nums[i - 1] && nums[i] > mobileprev) {
                    mobile = nums[i];
                    mobileprev = mobile;
                }
            }

            if (arrows[nums[i] - 1] && i != count - 1) {
                if (nums[i] > nums[i + 1] && nums[i] > mobileprev) {
                    mobile = nums[i];
                    mobileprev = mobile;
                }
            }
        }
        return mobile;
    }

    public void algorithmTrotter() {
        for (int j = 1; j < fact(count); j++) {
            int mobile = getMaxMobile();
            int id = searchArr(mobile);
            if (!arrows[nums[id - 1] - 1]) {
                int temp = nums[id - 1];
                nums[id - 1] = nums[id - 2];
                nums[id - 2] = temp;
            } else {
                int temp = nums[id];
                nums[id] = nums[id - 1];
                nums[id - 1] = temp;
            }
            for (int i = 0; i < count; i++) {
                if (nums[i] > mobile) {
                    arrows[nums[i] - 1] = !arrows[nums[i] - 1];
                }
            }
            for (int i = 0; i < count; i++) {
                System.out.print(nums[i]);
            }
            System.out.print("\n");
        }
    }

    public static int fact(int n) {
        if (n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        Trotter temp = new Trotter(3);
        temp.algorithmTrotter();
    }

}