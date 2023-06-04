package com.example.algorithmpractice.saike;

import java.util.Scanner;

/**
 * @author lmy
 * @version 1.0
 * @date 2023/6/4 10:50
 */
public class t10gpt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        String T = scanner.nextLine();
        int count = countMatchingWays(S, T);
        System.out.println(count);
    }

    public static int countMatchingWays(String S, String T) {
        int count = 0;
        int left = 0;
        int right = S.length() - 1;

        while (left < S.length() && S.charAt(left) != T.charAt(0)) {
            left++;
        }

        while (right >= 0 && S.charAt(right) != T.charAt(T.length() - 1)) {
            right--;
        }

        for (int i = left; i <= right; i++) {
            if (S.charAt(i) == T.charAt(0)) {
                int j = 0;
                int k = i;
                while (j < T.length() && k <= right) {
                    if (S.charAt(k) == T.charAt(j)) {
                        j++;
                    }
                    k++;
                }
                if (j == T.length()) {
                    count++;
                }
            }
        }

        return count;
    }

}
