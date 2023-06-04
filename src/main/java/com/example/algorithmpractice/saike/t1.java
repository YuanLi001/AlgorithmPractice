package com.example.algorithmpractice.saike;

import java.util.Scanner;

/**
 * @author lmy
 * @version 1.0
 * @date 2023/6/4 9:01
 */
public class t1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(calculateSumOfAllPossibleSplits(input));
    }

    private static long calculateSumOfAllPossibleSplits(String num) {
        long sum = 0;
        int length = num.length();

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j <= length; j++) {
                sum += Long.parseLong(num.substring(i, j));
            }
        }

        return sum;
    }
}
