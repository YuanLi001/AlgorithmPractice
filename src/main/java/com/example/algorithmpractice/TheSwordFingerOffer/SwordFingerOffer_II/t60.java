package com.example.algorithmpractice.TheSwordFingerOffer.SwordFingerOffer_II;

import java.util.Arrays;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/4/23 17:50
 */
public class t60 {
    public double[] dicesProbability(int n) {
        double[] dp=new double[6];
        Arrays.fill(dp,1.0/6.0);
        for (int i = 2; i <=n; i++) {
            double[] temp=new double[5*i+1];
            for (int j = 0; j < dp.length; j++) {
                for (int k = 0; k < 6; k++) {
                    temp[j+k]+=dp[j]/6.0;
                }
            }
            dp=temp;
        }
        return dp;
    }
}
