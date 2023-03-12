package com.example.algorithmpractice.hot100.test;

import java.util.Scanner;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2023/3/11 19:59
 */
public class t222 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        char[][] colorArr=new char[n][m];
        int[][] coins=new int[n][m];
        int[][] dp=new int[n][m];
        boolean[][] arrive=new boolean[n][m];
        arrive[0][0]=true;
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            colorArr[i]= s.toCharArray();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                coins[i][j]=sc.nextInt();
            }
        }
        //动态规划
        for (int i = 1; i < n; i++) {
            dp[i][0]=dp[i-1][0];
            if (colorArr[i][0] != colorArr[i - 1][0]) {
                dp[i][0] -= k;
            }
            if(dp[i][0]<0){
                break;
            }else {
                dp[i][0]+=coins[i][0];
                arrive[i][0]=true;
            }
        }
        for (int j = 1; j < m; j++) {
            dp[0][j]=dp[0][j-1];
            if( colorArr[0][j]!=colorArr[0][j-1] ){
                dp[0][j]-=k;
            }
            if(dp[0][j]<0){
                break;
            }else {
                dp[0][j]+=coins[0][j];
                arrive[0][j]=true;
            }

        }
        int down=0,right=0;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                //down
                if( arrive[i-1][j]==false ){
                    down=-1;
                }else {
                    down=dp[i-1][j];
                    if (colorArr[i][j] != colorArr[i - 1][j]) {
                        down -= k;
                    }
                    if(down<0){

                    }else {
                        arrive[i][j]=true;
                    }
                }
                //right
                if(arrive[i][j-1]==false){
                    right=-1;
                }else {
                    right=dp[i][j-1];
                    if (colorArr[i][j] != colorArr[i][j - 1]) {
                        right -= k;
                    }
                    if(right<0){

                    }else {
                        arrive[i][j]=true;
                    }
                }
                dp[i][j]=Math.max(down,right)+coins[i][j];
            }
        }
        int max=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(arrive[i][j]==true){
                    max=Math.max(dp[i][j],max );
                }

            }
        }
        System.out.println(max);
    }
}
