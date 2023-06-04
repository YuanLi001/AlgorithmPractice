package com.example.algorithmpractice.saike;

import java.util.Scanner;

/**
 * @author lmy
 * @version 1.0
 * @date 2023/6/4 11:01
 */
public class t10gpt3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        String T = scanner.nextLine();
        scanner.close();

        int n = S.length();
        int m = T.length();

        int[] left = new int[n];
        int[] right = new int[n];

        // 计算从左到右的前缀和
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (count < m && S.charAt(i) == T.charAt(count)) {
                count++;
            }
            left[i] = count;
        }

        // 计算从右到左的前缀和
        count = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (count < m && S.charAt(i) == T.charAt(m - 1 - count)) {
                count++;
            }
            right[i] = count;
        }

        // 计算精简 S 的方案数
        int result = 0;
        for (int i = 0; i < n - 1; i++) {
            if (left[i] + right[i + 1] >= m) {
                result++;
            }
        }

        System.out.println(result);
    }
}
