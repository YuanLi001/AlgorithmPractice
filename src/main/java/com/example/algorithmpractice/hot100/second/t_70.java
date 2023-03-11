package com.example.algorithmpractice.hot100.second;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2023/3/11 17:19
 */
public class t_70 {
    public int climbStairs(int n) {
        if(n==1){
            return 1;
        }else if(n==2){
            return 2;
        }
        int[] dp=new int[n+1];
        dp[1]=1;
        dp[2]=2;
        for (int i = 3; i <=n; i++) {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
