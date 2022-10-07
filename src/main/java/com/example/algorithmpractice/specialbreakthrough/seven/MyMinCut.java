package com.example.algorithmpractice.specialbreakthrough.seven;

import java.util.Arrays;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/10/7 14:55
 */
public class MyMinCut {
    public int minCut(String s){
        int len = s.length();
        if(len<2){
            return 0;
        }
        //预处理
        boolean[][] check=new boolean[len][len];
        for (int i = 0; i < len; i++) {
            Arrays.fill(check[i],true);
        }
        for (int i = len-1; i >=0 ; i--) {
            for (int j = i+1; j <len; j++) {
                check[i][j]= s.charAt(i)==s.charAt(j) && check[i+1][j-1];
            }
        }

        int[] dp=new int[len];
        Arrays.fill(dp, Integer.MAX_VALUE);
        for (int i = 0; i < len; i++) {
            if(check[0][i]){
                dp[i]=0;
                continue;
            }
            for (int j = 0; j <i; j++) {
                if(check[j+1][i]){
                    dp[i]=Math.min(dp[i],dp[j]+1);
                }
            }
        }
        return dp[len-1];
    }
}
