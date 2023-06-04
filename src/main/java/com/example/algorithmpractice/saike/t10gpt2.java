package com.example.algorithmpractice.saike;

import java.util.Scanner;

/**
 * @author lmy
 * @version 1.0
 * @date 2023/6/4 10:55
 */
public class t10gpt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        String T = scanner.nextLine();
        int count = countSubstring(S, T);
        System.out.println(count);
    }

    public static int countSubstring(String S, String T) {
        int m = S.length();
        int n = T.length();
        int[][] dp = new int[m + 1][n + 1];

        // 初始化边界条件
        for (int i = 0; i <= m; i++) {
            dp[i][0] = 1;
        }

        // 动态规划计算子问题
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (S.charAt(i - 1) == T.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[m][n];
    }

    public static boolean isSubsequence(String S, String T) {
        int i = 0;
        int j = 0;
        while (i < S.length() && j < T.length()) {
            if (S.charAt(i) == T.charAt(j)) {
                j++;
            }
            i++;
        }
        return j == T.length();
    }
}
