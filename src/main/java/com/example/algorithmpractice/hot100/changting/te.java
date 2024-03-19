package com.example.algorithmpractice.hot100.changting;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author lmy
 * @version 1.0
 * @date 2024/3/19 10:42
 */
public class te {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] positions = new int[N];
        for (int i = 0; i < N; i++) {
            positions[i] = sc.nextInt();
        }

        Arrays.sort(positions);
        int midInd = N / 2;
        int res = positions[midInd];
        System.out.println(res);

    }
}
