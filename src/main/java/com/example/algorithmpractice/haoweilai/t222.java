package com.example.algorithmpractice.haoweilai;

import java.util.Scanner;

/**
 * @author lmy
 * @version 1.0
 * @date 2024/3/7 19:29
 */
public class t222 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int mp=Math.min(a*2,Math.min(b,a+b));
        int[][] dp=new int[n+1][m+1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if(i>0 &&j>0){
                    dp[i][j]=Math.max(dp[i-1][j]+mp,dp[i][j-1]+mp);
                }else if(i>0){
                    dp[i][j]=dp[i-1][j]+mp;
                }else if(j>0){
                    dp[i][j]=dp[i][j-1]+mp;
                }
            }
        }
        System.out.println(dp[n][m]);
    }
}
