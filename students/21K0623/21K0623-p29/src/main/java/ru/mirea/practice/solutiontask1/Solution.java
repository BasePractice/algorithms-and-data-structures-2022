package ru.mirea.practice.solutiontask1;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solve();
    }

    private void solve() {
        try (Scanner scanner = new Scanner(System.in)) {
            int vertexCount = scanner.nextInt();
            int[][] g = new int[vertexCount][vertexCount];
            for (int i = 0; i < vertexCount; i++) {
                for (int j = 0; j < vertexCount; j++) {
                    g[i][j] = scanner.nextInt();
                }
            }
            int total = 0;
            for (int i = 0; i < vertexCount; i++) {
                for (int j = i; j < vertexCount; j++) {
                    if (g[i][j] == 1) {
                        total += 1;
                    }
                }
            }
            System.out.println(total);
        }
    }
}