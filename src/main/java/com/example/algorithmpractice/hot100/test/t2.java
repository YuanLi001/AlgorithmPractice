package com.example.algorithmpractice.hot100.test;

import java.util.Scanner;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2023/3/11 19:17
 */
public class t2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        char[][] colorArr=new char[n][m];
        int[][] coins=new int[n][m];
        int[][] dp=new int[n][m];
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
//            System.out.println(s);
            colorArr[i]= s.toCharArray();
        }
//        sc.nextLine();
//        sc.nextInt();
//        System.out.println("===============");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                coins[i][j]=sc.nextInt();
//                System.out.println(i+" "+j+":"+coins[i][j]);
            }
        }
        //动态规划
        for (int i = 1; i < n; i++) {
            dp[i][0]=dp[i-1][0]+coins[i][0];
            if(colorArr[i][0]!=colorArr[i-1][0]){
                dp[i][0]-=k;
            }
        }
        for (int j = 1; j < m; j++) {
            dp[0][j]=dp[0][j-1]+coins[0][j];
            if( colorArr[0][j]!=colorArr[0][j-1] ){
                dp[0][j]-=k;
            }

        }
        int down=0,right=0;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                //down
                down=dp[i-1][j]+coins[i][j];
                if(colorArr[i][j]!=colorArr[i-1][j]){
                    down-=k;
                }
                //right
                right=dp[i][j-1]+coins[i][j];
                if(colorArr[i][j]!=colorArr[i][j-1]){
                    right-=k;
                }
                dp[i][j]=Math.max(down,right);
            }
        }
        int max=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                max=Math.max(dp[i][j],max );
            }
        }
        System.out.println(max);
    }

}
//3 3 3
//BBR
//BRB
//RBB
//0 1 10
//2 10 100
//10 100 100



//1 7 2
//BBRBRBR
//0 3 2 4 1 1 1