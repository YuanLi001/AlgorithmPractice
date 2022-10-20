package com.example.algorithmpractice.specialbreakthrough.eight;

import java.util.Arrays;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/10/20 10:32
 */
public class CoinChange_II {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp,amount + 1);
        dp[0]=0;
        for (int i = 1; i < amount + 1; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (i - coins[j] >= 0) {
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }
        if(dp[amount]==amount + 1){
            return -1;
        }else {
            return dp[amount];
        }
    }
}
