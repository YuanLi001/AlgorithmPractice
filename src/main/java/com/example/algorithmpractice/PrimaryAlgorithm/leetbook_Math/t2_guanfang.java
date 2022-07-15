package com.example.algorithmpractice.PrimaryAlgorithm.leetbook_Math;

import java.util.Arrays;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/3/9 10:16
 */
public class t2_guanfang {
    public int countPrimes(int n) {
        int[] isPrime = new int[n];
        Arrays.fill(isPrime, 1);
        int ans = 0;
        for (int i = 2; i < n; ++i) {
            if (isPrime[i] == 1) {
                ans += 1;
                if ((long) i * i < n) {
                    for (int j = i * i; j < n; j += i) {
                        isPrime[j] = 0;
                    }
                }
            }
        }
        return ans;
    }

}
