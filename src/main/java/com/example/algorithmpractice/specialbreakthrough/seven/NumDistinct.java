package com.example.algorithmpractice.specialbreakthrough.seven;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/10/10 11:11
 */
public class NumDistinct {
    public int numDistinct(String s, String t) {
        int sLen=s.length(),tLen=t.length();
        int[][]  dp=new int[sLen+1][tLen+1];
        for (int i = 0; i <= sLen; i++) {
            dp[i][0]=1;
        }
        for (int i = 1; i <= sLen; i++) {
            for (int j = 1; j <= tLen ; j++) {
                if(s.charAt(i-1)==t.charAt(j-1) ){
                    dp[i][j]=dp[i-1][j-1]+dp[i-1][j];
                }else {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[sLen][tLen];
    }
}
